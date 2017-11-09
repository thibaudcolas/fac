package gestion;

import java.util.Collection;
import java.util.Vector;
import java.util.Iterator;

public class Bank {
	
	/**
	 * this constructor initializes the attributes : accountNumbers is initially 0, 
	 * accounts and clients and initialized with new empty Vectors
	 */
	public Bank() {
		this.accountNumbers = 0;
		this.accounts = new Vector();
		this.clients = new Vector();
	}

	
	// this is a counter that is incremented each time a new account is created
	private int accountNumbers;

	// @uml.property name="accountNumbers"
	public int getAccountNumbers() {
		return accountNumbers;
	}

	// @uml.property name="accountNumbers"
	public void setAccountNumbers(int accountNumbers) {
		this.accountNumbers = accountNumbers;
	}

	/**
	 * @uml.property name="clients"
	 * @uml.associationEnd inverse="bank:gestionSimpleATester.Person" multiplicity="(0 -1)"
	 */
	private Collection clients;

	// @uml.property name="clients"
	public java.util.Collection getClients() {
		return clients;
	}

	// @uml.property name="clients"
	public void setClients(java.util.Collection value) {
		clients = value;
	}

	// @uml.property name="clients"
	public Iterator clientsIterator() {
		return clients.iterator();
	}

	// @uml.property name="clients"
	public boolean addClients(Person element) {
		return clients.add(element);
	}

	// @uml.property name="clients"
	public boolean removeClients(Person element) {
		return clients.remove(element);
	}

	// @uml.property name="clients"
	public boolean isClientsEmpty() {
		return clients.isEmpty();
	}

	// @uml.property name="clients"
	public void clearClients() {
		clients.clear();
	}

	// @uml.property name="clients"
	public boolean containsClients(Person element) {
		return clients.contains(element);
	}

	// @uml.property name="clients"
	public boolean containsAllClients(Collection elements) {
		return clients.containsAll(elements);
	}

	// @uml.property name="clients"
	public int clientsSize() {
		return clients.size();
	}

	// @uml.property name="clients"
	public Person[] clientsToArray() {
		return (Person[]) clients
			.toArray(new Person[clients.size()]);
	}

	/**
	 * Creates an account for the person named name. 
	 * If no client has this name, a new client object is created and is added to the list of clients, then the account is created
	 * If the client exists the account is created, added to the bank's and the client's list of accounts
	 */
	public int addAccount(String name, float amount, float overdraft) {
		Person p = getClient(name);		
		//if a client named name already exists in the bank's set of clients
		if (p!=null){
			Account a = new Account(p, amount, overdraft, accountNumbers);
			this.addAccounts(a);
		}
		//if the client does not exist, add it tp the bank's list of clients and create account
		else{
			Person client = new Person(name);
			this.addClients(client);
			Account a = new Account(client, amount, overdraft, accountNumbers);
			this.addAccounts(a);		
		}
		return accountNumbers;
	}

	/**
	 * Closes the account number accountNumber. 
	 * If the account exists, it is removed form the bank's list of accounts and from the owner's list of accounts.
	 * If the account does not exist, an Exception is thrown. 
	 */
	public void closeAccount(int accountNumber) throws Exception {
		Account a=getAccount(accountNumber);
		if (a!=null){
			a.getOwner().removeAccounts(a);
			this.removeAccounts(a);
		}
		else{
			Exception error = new Exception("The account number "+accountNumber+" does not exist. Impossible to close this account");
			throw error;
		}
	}

	/**
	 * Looks for a person named name in the set of clients.
	 * Returns the Person object corresponding to the client if it exists
	 * Returns null if there is no client named name 
	 */
	public Person getClient(String name) {
		Iterator it = this.clientsIterator();
		while (it.hasNext()){
			Person p = (Person)it.next();
			if(p.getName()==name){
				return p;
			}
			
		}
		return null;
	}

	/**
	 * Looks for an account with the number accountNumber in the set of accounts
	 * Returns the account if it exists
	 * Returns null if no account has the number accountNumber 
	 * The assumption is that there cannot be several accounts with the same number 
	 */
	public Account getAccount(int accountNumber) {
		Iterator it = this.accountsIterator();
		while (it.hasNext()){
			Account a = (Account)it.next();
			if(a.getNumber()==accountNumber){
				return a;
			}
			
		}
		return null;
	}

	/**
	 * Deposits the amount on the account number accountNumber
	 * Throws an exception if there is no account number accountNumber
	 */
	public void deposit(int accountNumber, float amount) throws Exception {
		Account a = getAccount(accountNumber);
		if (a!=null){
			a.deposit(amount);
		}
		else{
			Exception error = new Exception("The account number "+accountNumber+" does not exist. Impossible to deposit");
			throw error;
		}
	}

	/**
	 * Withdraws the amount from the account number accountNumber
	 * Throws an exception if there is no account number accountNumber
	 */
	public void withdraw(int accountNumber, float amount) throws Exception {
		Account a = getAccount(accountNumber);
		if (a!=null){
			a.withdraw(amount);
		}
		else{
			Exception error = new Exception("The account number "+accountNumber+" does not exist. Impossible to withdraw");
			throw error;
		}
	}

	/**
	 * Returns the collection of accounts of the client named name
	 * If there is no client named name, the method returns null
	 */
	public Account[] getAccountsOfClient(String name) {
		Person client = getClient(name);
		if (client!=null){
			return client.accountsToArray();
		}
		else{
			return null;
		}
	}

	/**
	 * @uml.property name="accounts"
	 * @uml.associationEnd aggregation="composite" inverse="bank:Account" multiplicity="(0 -1)"
	 */
	private Collection accounts;

	// @uml.property name="accounts"
	public java.util.Collection getAccounts() {
		return accounts;
	}

	// @uml.property name="accounts"
	public void setAccounts(java.util.Collection value) {
		accounts = value;
	}

	// @uml.property name="accounts"
	public Iterator accountsIterator() {
		return accounts.iterator();
	}

	// @uml.property name="accounts"
	public boolean addAccounts(Account element) {
		return accounts.add(element);
	}

	// @uml.property name="accounts"
	public boolean removeAccounts(Account element) {
		return accounts.remove(element);
	}

	// @uml.property name="accounts"
	public boolean isAccountsEmpty() {
		return accounts.isEmpty();
	}

	// @uml.property name="accounts"
	public void clearAccounts() {
		accounts.clear();
	}

	// @uml.property name="accounts"
	public boolean containsAccounts(Account element) {
		return accounts.contains(element);
	}

	// @uml.property name="accounts"
	public boolean containsAllAccounts(Collection elements) {
		return accounts.containsAll(elements);
	}

	// @uml.property name="accounts"
	public int accountsSize() {
		return accounts.size();
	}

	// @uml.property name="accounts"
	public Account[] accountsToArray() {
		return (Account[]) accounts
			.toArray(new Account[accounts.size()]);
	}

}
