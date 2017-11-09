package gestion;

import java.util.Collection;
import java.util.Vector;
import java.util.Iterator;

public class Account {
	
	// This attribute memorizes the current balance of the account
	private float balance;
	// This is the maximum overdraft authorized for this account. The overdraft is positive.
	private float overdraft;
	// this is the number of the account ; This number is unique for a given Bank. 
	private int number;
	/**
	 * @uml.property name="history"
	 * @uml.associationEnd inverse="compte:gestionSimpleATester.Operation" multiplicity="(0 -1)
	 */
	private Collection<Operation> history;
	/**
	 * @uml.property name="owner"
	 * @uml.associationEnd inverse="accounts:Person" multiplicity="(0 1)"
	 */
	private Person owner;
	
	/**
	 * Initializes the owner, amount, overdraft and the account number with parameters
	 * The method also initializes the history with a new empty Vector
	 */
	public Account(Person p, float a, float o, int n){
		this.owner = p;
		this.balance = a;
		this.overdraft = o;
		this.number = n;
		this.history = new Vector<Operation>();
	}


	/**
	 *  Adds the amount to the current balance
	 *  Adds this operation in the history
	 */
	public void deposit(float amount) {
		//TODO Ajouter exception si amount négatif ?
		balance += Math.max(amount, 0);
		//TODO Ajouter l'opération même si le dépôt échoue / ou pas ?
		history.add(new DepositOperation(amount));
	}

	/**
	 * If the amount is lower or equal to the balance, withdraws the amount
	 * If the amount is greater than the balance and the difference between 
	 * the balance and the amount is lower than the overdraft, 
	 * withdraws the amount and throws an exception to warn that the balance is negative
	 * If the difference between the balance and the amount is greater than the overdraft, 
	 * the amount is not withdrawn and an exception is thrown to indicate that there is not enough credit.	
	 */
	public void withdraw(float amount) throws Exception {
		//TODO Ajouter exception si amount négatif ?
		float newBalance = balance - Math.max(amount,0);
		if (newBalance >= 0) {
			balance = newBalance;
		}
		else{
			if (newBalance >= - overdraft) { 
				balance = newBalance;
				throw new Exception("Warning: the balance is negative: " + balance);
			}
			else{
				throw new Exception("Could not proceed withdrawal. Not enough credit.");
			}
		}
		//TODO Ajouter l'opération même si le dépôt échoue / ou pas ?
		history.add(new WithdrawOperation(amount));
	}

	// @uml.property name="history"
	public Collection<Operation> getHistory() {
		return history;
	}

	// @uml.property name="history"
	public void setHistory(Collection<Operation> value) {
		history = value;
	}

	// @uml.property name="history"
	public Iterator historyIterator() {
		return history.iterator();
	}

	// @uml.property name="history"
	public boolean addHistory(Operation element) {
		return history.add(element);
	}

	// @uml.property name="history"
	public boolean removeHistory(Operation element) {
		return history.remove(element);
	}

	// @uml.property name="history"
	public boolean isHistoryEmpty() {
		return history.isEmpty();
	}

	// @uml.property name="history"
	public void clearHistory() {
		history.clear();
	}

	// @uml.property name="history"
	public boolean containsHistory(Operation element) {
		return history.contains(element);
	}

	// @uml.property name="history"
	public boolean containsAllHistory(Collection elements) {
		return history.containsAll(elements);
	}

	// @uml.property name="history"
	public int historySize() {
		return history.size();
	}

	// @uml.property name="history"
	public Operation[] historyToArray() {
		return (Operation[]) history
			.toArray(new Operation[history.size()]);
	}

	// @uml.property name="overdraft"
	public float getOverdraft() {
		return overdraft;
	}

	// @uml.property name="overdraft"
	public void setOverdraft(float overdraft) {
		this.overdraft = overdraft;
	}

	// @uml.property name="balance"
	public float getBalance() {
		return balance;
	}

	// @uml.property name="balance"
	public void setBalance(float balance) {
		this.balance = balance;
	}

	// @uml.property name="number"
	public int getNumber() {
		return number;
	}

	// @uml.property name="number"
	public void setNumber(int number) {
		this.number = number;
	}

	// @uml.property name="owner"
	public Person getOwner() {
		return owner;
	}

	// @uml.property name="owner"
	public void setOwner(Person owner) {
		this.owner = owner;
	}

}
