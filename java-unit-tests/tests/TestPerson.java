package tests;

import static org.junit.Assert.*;

import java.util.Vector;

import gestion.*;

import org.junit.*;

/**
 * @author Thibaud Colas
 *
 */
public class TestPerson {

	private Person p;
	private String ini;
	
	@Before
	public void setUp() throws Exception {
		ini = "Threepwood";
		p = new Person(ini);
	}

	@After
	public void tearDown() throws Exception {
		p.clearAccounts();
	}
	
	@Test
	public void testInit() {
		
		assertTrue(p.isAccountsEmpty());
		assertEquals(p.accountsSize(),0);
	}
	
	@Test
	public void testGetSetName() {
		
		assertEquals(p.getName(), ini);
		
		p.setName("");
		assertEquals(p.getName(), "");
		
		String other = "Garcin";
		p.setName(other);
		assertEquals(p.getName(), other);
	}
	
	@Test
	public void testGetSetAccounts() {
		
		assertTrue(p.getAccounts().isEmpty());
		assertEquals(p.getAccounts().size(), 0);
		
		Account a = new Account(p, 0, 0, 0);
		Account b = new Account(p, 0, 0, 0);
		Account c = new Account(p, 0, 0, 0);
		Vector<Account> v = new Vector<Account>(2);
        v.add(a);
        v.add(b);
        v.add(c);
        
        p.setAccounts(v);
        
        assertFalse(p.getAccounts().isEmpty());
        assertEquals(p.getAccounts().size(), 3);
        assertEquals(p.getAccounts(),v);
		
        assertTrue(p.getAccounts().contains(v.get(0)));
        assertTrue(p.getAccounts().contains(v.get(1)));
        assertTrue(p.getAccounts().contains(v.get(2)));
		
		p.clearAccounts();
		assertTrue(p.getAccounts().isEmpty());
		assertEquals(p.getAccounts().size(), 0);
	}
	
	@Test
	public void testAddRemoveAccounts() {
		
		assertTrue(p.getAccounts().isEmpty());
		assertEquals(p.getAccounts().size(), 0);
		
		Account a = new Account(p, 0, 0, 0);
		Account b = new Account(p, 0, 0, 0);
		Vector<Account> v = new Vector<Account>(2);
        v.add(a);
        v.add(b);
		
        assertTrue(p.addAccounts(a));
		assertFalse(p.getAccounts().isEmpty());
        assertEquals(p.getAccounts().size(), 1);
        assertTrue(p.getAccounts().contains(a));
        
        assertTrue(p.addAccounts(b));
		assertFalse(p.getAccounts().isEmpty());
        assertEquals(p.getAccounts().size(), 2);
        assertTrue(p.getAccounts().contains(b));
        
        assertTrue(p.getAccounts().containsAll(v));
        
        /* TODO Voulu ?
        assertFalse(p.addAccounts(b));
        assertEquals(p.getAccounts().size(), 2);
        */
        
        assertTrue(p.removeAccounts(a));
        assertEquals(p.getAccounts().size(), 1);
        assertFalse(p.getAccounts().contains(a));
        
        assertFalse(p.removeAccounts(a));
		
        p.clearAccounts();
        assertTrue(p.getAccounts().isEmpty());
		assertEquals(p.getAccounts().size(), 0);
	}
	
	@Test
	public void testPredicats() {
		
		assertTrue(p.getAccounts().isEmpty());
		assertEquals(p.getAccounts().size(), 0);
		
		Account a = new Account(p, 0, 0, 0);
		Account b = new Account(p, 0, 0, 0);
		Vector<Account> v = new Vector<Account>(2);
        v.add(a);
        v.add(b);
		
        assertTrue(p.addAccounts(a));
        assertTrue(p.addAccounts(b));
		assertFalse(p.getAccounts().isEmpty());
        assertEquals(p.getAccounts().size(), 2);
        
        assertTrue(p.containsAccounts(a));
        assertTrue(p.containsAccounts(b));
        
        assertTrue(p.getAccounts().containsAll(v));
        assertTrue(p.containsAllAccounts(v));
	}
	
	@Test
	public void testTypeAccounts() {
		Vector v = new Vector(3);
		Integer i = new Integer(3);
        String s = new String("cellardoor");
        Float f = new Float(3.14);
        v.add(i);
        v.add(s);
        v.add(f);
        
        //TODO Voulu ?
        /*
        p.setAccounts(v);
        assertTrue(p.getAccounts().isEmpty());
        */
	}
	
	@Test
	public void testIterator() {
		//TODO
		/*
		Iterator tmp = p.accountsIterator();
		assertTrue(tmp.hasNext());
		assertEquals(p.accountsIterator(), p.getAccounts().iterator());
		*/
	}
	
	@Test (expected=IndexOutOfBoundsException.class)
	public void testToArray() {
		Account a = new Account(p, 0, 0, 0);
		Account b = new Account(p, 0, 0, 0);
		
		assertTrue(p.addAccounts(a));
		assertTrue(p.addAccounts(b));
		
		Account[] accountarray = p.accountsToArray();
		assertEquals(accountarray[0],a);
		assertEquals(accountarray[1],b);
		// Exception
		Account c = accountarray[2];
		assertEquals(accountarray[0].getOwner().getName(),"Threepwood");
		assertEquals(p.accountsSize(),accountarray.length);
	}
}
