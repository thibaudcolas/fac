
package gestion;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Display {
	
	
	// These are the internal ids fir the different commands allowed for the Bank
	private static final int createCmd = 1;
	private static final int closeCmd = 2;
	private static final int depositCmd = 3;
	private static final int withdrawCmd = 4;
	private static final int balanceCmd = 5;
	private static final int historyCmd = 6;
	private static final int clientsCmd = 7;
	private static final int accountsCmd = 8;
	private static final int accountsOfClientsCmd = 9;
	private static final int stopCmd = -1;

	/**
	 * @uml.property name="bank"
	 * @uml.associationEnd inverse="display:gestionSimpleATester.Bank" multiplicity="(1 1)"
	 */
	private static Bank bank;

	// @uml.property name="bank"
	public static Bank getBank() {
		return bank;
	}
		
	/**
	 * Processes the create account operation
	 * Messages ask for the name of the owner, the initial balance and overdraft
	 */
	public static void createAccount(){
		System.out.println("Name of the owner");
		String name = readLine();
		System.out.println("Initial balance");
		float amount = readNumber();
		System.out.println("Authorized overdraft");
		float overdraft = readNumber();
		int number = bank.addAccount(name, overdraft, amount);
		System.out.println("The account number "+number+" is now created");
	}
	
	/**
	 * Processes the close account operation
	 * Message asks for the number of the account to close
	 */
	public static void closeAccount(){
		System.out.println("Number of the account to close");
		int number = readInt();
		try{
			bank.closeAccount(number);
			System.out.println("The account number "+number+" is closed now.");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Processes the deposit operation
	 * Messages ask for the number of the account and the amount to deposit
	 */
	public static void deposit(){
		System.out.println("Number of the account for deposit");
		int number = readInt();
		System.out.println("Amount for deposit");
		int amount = readInt();
		try{
			bank.deposit(amount, number);
			System.out.println("Deposit OK. The new balance for account number "+number+" is: "+bank.getAccount(number).getBalance());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Processes the withdraw operation
	 * Messages ask for the number of the account and the amount for withdraw
	 */
	public static void withdraw(){
		System.out.println("Number of the account for withdrawal");
		int number = readInt();
		System.out.println("Amount for withdrawal");
		int amount = readInt();
		try{
			bank.withdraw(number, amount);
			System.out.println("Withdrawal OK. The new balance for account number "+number+" is: "+bank.getAccount(number).getBalance());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Displays the balance for an account. 
	 * A message asks for the number of the account.
	 */
	public static void balance(){
		System.out.println("Number of the account for balance");
		int number = readInt();
		Account acc = bank.getAccount(number);
		if (acc!=null){
			System.out.println("The balance for account number "+number+" is: "+acc.getBalance());
		}
		else{
			System.out.println("The account number "+number+" does not exist. Impossible to get the balance.");			
		}
	}
	
	/**
	 * Displays the history for an account. 
	 * A message asks for the number of the account.
	 * If the account with this number does not exist, an error message is displayed
	 */
	public static void history(){
		System.out.println("Number of the account for history");
		int number = readInt();
		Account acc = bank.getAccount(number);
		if (acc!=null){
			System.out.println("The history for account number "+number+" is: ");
			Operation[] history = acc.historyToArray();
			for(int i=1; i<history.length; i++){
				System.out.println("Operation number "+(i+1)+" is "+history[i].getOperationType()+" of "+history[i].getAmount());
			}
		}
		else{
			System.out.println("The account number "+number+" does not exist. Impossible to get the history.");			
		}
	}

	// Displays the list of the names of clients
	public static void clients(){
		System.out.println("The list of clients of the bank is:");
		Iterator it = bank.clientsIterator();
		while(it.hasNext()){
			Person client = (Person)it.next();
			System.out.println(client.getName());
		}
	}
	
	// Displays the list of accounts in the bank (number, balance and overdraft)
	public static void displayAccounts() {
		Iterator it = bank.accountsIterator();
		while(it.hasNext()){
			Account acc = (Account)it.next();
			System.out.println("Account number "+acc.getNumber()+" is owned by "+acc.getOwner().getName());
			System.out.println("      The balance is :"+acc.getBalance());
			System.out.println("      The overdraft is :"+acc.getOverdraft());
		}
	}

	/**
	 * Displays the list of accounts of a client
	 * If the client does not exist a message is dsiplayed on the console
	 */
	public static void displayAccountsOfClient() {
		System.out.println("Name of the client:");
		String name = readLine();
		Account[] accounts = bank.getAccountsOfClient(name);
		if (accounts!=null){
			for (int i = 0; i<accounts.length; i++){
				System.out.println("Account number "+accounts[i].getNumber());
			}
		}
		else{
			System.out.println("The client "+name+" does not exist");
		}
	}

	// reads a string from the standard input
	private static String readLine() {
		BufferedReader standard = new BufferedReader(
				new InputStreamReader(System.in));
		try{
			String inline = standard.readLine();
			return inline;
		}
		catch (Exception e)
		{
			return ("data entry error");
		}

	}
	
	// reads an integer from the standard input
	public static int readInt(){
		BufferedReader standard = new BufferedReader(
				new InputStreamReader(System.in));
		try{
			String inline = standard.readLine();
			Integer from_user = Integer.valueOf(inline);
			return from_user.intValue();
		}
		catch (Exception e)
		{
			return (0);
		}
	}
	
	// reads a float from the standard input
	public static float readNumber(){
		BufferedReader standard = new BufferedReader(
				new InputStreamReader(System.in));
		try{
			String inline = standard.readLine();
			Float from_user = Float.valueOf(inline);
			return from_user.floatValue();
		}
		catch (Exception e)
		{
			return (0.0f);
		}
	}


	// Displays the menu to process operations on the bank
	public static void menu(){
		System.out.println("Please choose a command number");
		System.out.println(createCmd +": Create an account");
		System.out.println(closeCmd +": Close an account");
		System.out.println(depositCmd +": Make a deposit on an account");
		System.out.println(withdrawCmd +": Withdraw from an account");
		System.out.println(balanceCmd+ ": Balance of an account");
		System.out.println(historyCmd+ ": History of an account");
		System.out.println(clientsCmd+ ": Display the list of clients");
		System.out.println(accountsCmd+ ": Display the list of accounts");
		System.out.println(accountsOfClientsCmd+ ": Display the list of accounts of a client");
		System.out.println(stopCmd+ ": exit the system");
	}
	
	// displays the menu and processes the command while the user doesn't ask for stop
	public static void main(String[] args) {
		bank = new Bank();
		menu();
		int cmd = readInt();
		while (cmd!=stopCmd){
			process(cmd);
			menu();
			cmd = readInt();
		}
		System.out.println("Goodbye");
	}

	// Processes the command with the number command
	public static void process(int command){
		switch(command){
			case createCmd : createAccount(); break;
			case closeCmd : closeAccount(); break;
			case depositCmd : deposit(); break;
			case withdrawCmd : withdraw(); break;
			case balanceCmd : balance(); break;
			case historyCmd : history(); break;
			case clientsCmd : clients(); break;
			case accountsCmd : displayAccounts(); break;
			case accountsOfClientsCmd : displayAccountsOfClient(); break;
			default : System.out.println("this is not a valid command"); break;
		}
	}

	// @uml.property name="bank"
	public static void setBank(Bank bankParameter) {
		bank = bankParameter;
	}

}
