package tests;

import static org.junit.Assert.*;

import gestion.*;

import org.junit.*;

/**
 * @author Thibaud Colas
 *
 */
public class TestProperty {
	
	private Account acc;
	private Account bis;
	private Person own;
	private Person oth;

	@Before
	public void setUp() throws Exception {
		own = new Person("Randall Stevens");
		acc = new Account(own, 0, 0, 12345);
		
		oth = new Person("Warden Samuel Norton");
		bis = new Account(oth, 0, 0, 54321);
	}

	@After
	public void tearDown() throws Exception {
		own.clearAccounts();
		acc.clearHistory();
	}
	
	@Test //(expected=IndexOutOfBoundsException.class)
	public void testProperty() {
		own.addAccounts(acc);
		assertEquals(own.accountsToArray()[0], acc);
		assertEquals(own, acc.getOwner());
		
		oth.addAccounts(bis);
		assertEquals(oth.accountsToArray()[0], bis);
		assertEquals(oth, bis.getOwner());
		
		//TODO Voulu ?
		/*
		own.addAccounts(bis);
		assertTrue(own.accountsSize() == 1);
		assertFalse(own.accountsToArray()[1] == bis);
		
		
		oth.addAccounts(acc);
		assertTrue(oth.accountsSize() == 1);
		assertFalse(oth.accountsToArray()[1].getOwner() == oth);
		*/
		
	}

}
