package gestion;

import java.util.Collection;
import java.util.Vector;



import java.util.Iterator;


public class Person {
	
	// The name of the person
	private String name;
	/** 
	 * @uml.property name="accounts"
	 * @uml.associationEnd inverse="owner:gestionSimpleATester.Account" multiplicity="(0 -1)"
	 */
	private Collection accounts;
	
	/**
	 * Initializes the name of the person with the param n
	 * Creates a new vector to intialize the accounts set 
	 */
	public Person(String n){
		name = n;
		accounts = new Vector();
	}

	// @uml.property name="name"
	public String getName() {
		return name;
	}

	// @uml.property name="name"
	public void setName(String name) {
		this.name = name;
	}

	// @uml.property name="accounts"
	public Collection getAccounts() {
		return accounts;
	}

	// @uml.property name="accounts"
	public void setAccounts(Collection value) {
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

	//  @uml.property name="accounts"
	public Account[] accountsToArray() {
		return (Account[]) accounts.toArray(new Account[accounts.size()]);
	}

}
