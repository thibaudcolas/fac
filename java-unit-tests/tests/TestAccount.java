package tests;

import static org.junit.Assert.*;

import java.util.Vector;

import gestion.*;

import org.junit.*;

/**
 * @author Thibaud Colas
 *
 */
public class TestAccount {

	private Account acc;
	private Person own;
	
	private float ini;
	private float bisini;
	private int terini;
	
	@Before
	public void setUp() throws Exception {
		ini = 500;
		bisini = 50;
		terini = 5000;
		acc = new Account(own,ini,bisini,terini);
	}

	@After
	public void tearDown() throws Exception {
		acc.clearHistory();
	}
	
	@Test
	public void testInit() {
		assertTrue(acc.isHistoryEmpty());
		assertEquals(acc.historySize(), 0);
	}
	
	@Test
	public void testGetSetMulti() {
		
		assertEquals(acc.getOwner(), own);
		
		Person tmp = new Person("Poutine");
		acc.setOwner(tmp);
		assertEquals(acc.getOwner(), tmp);
		
		assertTrue(acc.getBalance() == ini);
		float newbal = (float) 33.5;
		acc.setBalance(newbal);
		assertTrue(acc.getBalance() == newbal);
		
		assertTrue(acc.getOverdraft() == bisini);
		float newover = (float) 20.5;
		acc.setOverdraft(newover);
		assertTrue(acc.getOverdraft() == newover);
		
		assertTrue(acc.getNumber() == terini);
		int newnum = 144;
		acc.setNumber(newnum);
		assertTrue(acc.getNumber() == newnum);
		
		
		newbal = (float) -42;
		acc.setBalance(newbal);
		assertTrue(acc.getBalance() == newbal);
		
		newover = (float) -30.5;
		acc.setOverdraft(newover);
		assertTrue(acc.getOverdraft() == newover);
		
		newnum = - 22;
		acc.setNumber(newnum);
		assertTrue(acc.getNumber() == newnum);
	}
	
	@Test
	public void testGetSetHistory() {
		
		assertTrue(acc.getHistory().isEmpty());
		assertEquals(acc.getHistory().size(), 0);
		
		Operation a = new DepositOperation(20);
		Operation b = new WithdrawOperation(10);
		Operation c = new WithdrawOperation(100);
		Vector<Operation> v = new Vector<Operation>(2);
        v.add(a);
        v.add(b);
        v.add(c);
        
        acc.setHistory(v);
        
        assertFalse(acc.getHistory().isEmpty());
        assertEquals(acc.getHistory().size(), 3);
        assertEquals(acc.getHistory(),v);
		
        assertTrue(acc.getHistory().contains(v.get(0)));
        assertTrue(acc.getHistory().contains(v.get(1)));
        assertTrue(acc.getHistory().contains(v.get(2)));
		//TODO
		acc.clearHistory();
		assertTrue(acc.getHistory().isEmpty());
		assertEquals(acc.getHistory().size(), 0);
	}
	
	@Test
	public void testAddRemoveAccounts() {
		
		assertTrue(acc.getHistory().isEmpty());
		assertEquals(acc.getHistory().size(), 0);
		
		Operation a = new DepositOperation(20);
		Operation b = new WithdrawOperation(10);
		Vector<Operation> v = new Vector<Operation>(2);
        v.add(a);
        v.add(b);
		
        assertTrue(acc.addHistory(a));
		assertFalse(acc.getHistory().isEmpty());
        assertEquals(acc.getHistory().size(), 1);
        assertTrue(acc.getHistory().contains(a));
        
        assertTrue(acc.addHistory(b));
		assertFalse(acc.getHistory().isEmpty());
        assertEquals(acc.getHistory().size(), 2);
        assertTrue(acc.getHistory().contains(b));
        
        assertTrue(acc.getHistory().containsAll(v));
        
        /* TODO Voulu ?
        assertFalse(acc.addHistory(b));
        assertEquals(acc.getHistory().size(), 2);
        */
        
        assertTrue(acc.removeHistory(a));
        assertEquals(acc.getHistory().size(), 1);
        assertFalse(acc.getHistory().contains(a));
        
        assertFalse(acc.removeHistory(a));
		
        acc.clearHistory();
        assertTrue(acc.getHistory().isEmpty());
		assertEquals(acc.getHistory().size(), 0);
	}
	
	@Test
	public void testPredicats() {
		
		assertTrue(acc.getHistory().isEmpty());
		assertEquals(acc.getHistory().size(), 0);
		
		Operation a = new DepositOperation(20);
		Operation b = new WithdrawOperation(10);
		Vector<Operation> v = new Vector<Operation>(2);
        v.add(a);
        v.add(b);
		
        assertTrue(acc.addHistory(a));
        assertTrue(acc.addHistory(b));
		assertFalse(acc.getHistory().isEmpty());
        assertEquals(acc.getHistory().size(), 2);
        
        assertTrue(acc.containsHistory(a));
        assertTrue(acc.containsHistory(b));
        
        assertTrue(acc.getHistory().containsAll(v));
        assertTrue(acc.containsAllHistory(v));
	}
	
	@Test
	public void testDeposit() {
		assertTrue(acc.getBalance() == ini);
		
		float posdep = (float) 100.5;
		acc.deposit(posdep);
		assertTrue(acc.getBalance() == ini + posdep);
		assertTrue(acc.historySize() == 1);
		assertTrue(acc.historyToArray()[0].getAmount() == posdep);
		assertTrue(acc.historyToArray()[0].getOperationType() == "Deposit");
		
		//TODO Ajouter l'opération même si le dépôt échoue / ou pas ?
		float negdep = (float) -50;
		acc.deposit(negdep);
		assertFalse(acc.getBalance() == ini + posdep + negdep);
		assertTrue(acc.getBalance() == ini + posdep);
		assertTrue(acc.historySize() == 2);
		assertTrue(acc.historyToArray()[1].getAmount() == negdep);
		assertTrue(acc.historyToArray()[1].getOperationType() == "Deposit");
		
		acc.clearHistory();
		assertTrue(acc.isHistoryEmpty());
	}
	
	@Test
	public void testWithdraw() {
		assertTrue(acc.getBalance() == ini);
		
		try {
			float poswit = (float) 33.5;
			acc.withdraw(poswit);
			assertTrue(acc.getBalance() == ini - poswit);
			assertTrue(acc.historySize() == 1);
			assertTrue(acc.historyToArray()[0].getAmount() == poswit);
			assertTrue(acc.historyToArray()[0].getOperationType() == "Withdraw");
			
			float eqwit = acc.getBalance();
			acc.withdraw(eqwit);
			assertTrue(acc.getBalance() == 0);
			assertTrue(acc.historySize() == 2);
			assertTrue(acc.historyToArray()[1].getAmount() == eqwit);
			assertTrue(acc.historyToArray()[1].getOperationType() == "Withdraw");
			
			//TODO Ajouter l'opération même si le retrait échoue / ou pas ?
			float negwit = (float) -10;
			acc.withdraw(negwit);
			assertFalse(acc.getBalance() == 0 - negwit);
			assertTrue(acc.getBalance() == 0);
			assertTrue(acc.historySize() == 3);
			assertTrue(acc.historyToArray()[2].getAmount() == negwit);
			assertTrue(acc.historyToArray()[2].getOperationType() == "Withdraw");
		}
		//TODO Ajouter plusieurs catch pour plusieurs types d'exceptions et tester les messages.
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			acc.clearHistory();
			assertTrue(acc.isHistoryEmpty());
		}
	}
	
	@Test (expected=Exception.class)
	public void testWithdrawException() throws Exception {
		assertTrue(acc.getBalance() == ini);
		
		float eqwit = acc.getOverdraft() + acc.getBalance();
		acc.withdraw(eqwit);
		assertTrue(acc.getBalance() == - acc.getOverdraft());
		assertTrue(acc.historySize() == 1);
		assertTrue(acc.historyToArray()[0].getAmount() == eqwit);
		assertTrue(acc.historyToArray()[0].getOperationType() == "Withdraw");
		
		acc.setBalance(ini);
		
		float bigwit = acc.getBalance() + 50;
		acc.withdraw(bigwit);
		assertTrue(acc.getBalance() == ini - bigwit);
		assertTrue(acc.historySize() == 2);
		assertTrue(acc.historyToArray()[1].getAmount() == bigwit);
		assertTrue(acc.historyToArray()[1].getOperationType() == "Withdraw");
		
		acc.setBalance(ini);
		
		float bigbiswit = (float) acc.getBalance() * 1000;
		acc.withdraw(bigbiswit);
		assertFalse(acc.getBalance() == ini - bigbiswit);
		assertTrue(acc.getBalance() == ini);
		assertTrue(acc.historySize() == 3);
		assertTrue(acc.historyToArray()[2].getAmount() == bigbiswit);
		assertTrue(acc.historyToArray()[2].getOperationType() == "Withdraw");
		
		acc.clearHistory();
		assertTrue(acc.isHistoryEmpty());
	}
	
	@Test
	public void testTypeOperations() {
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
        assertTrue(acc.getHistory().isEmpty());
        */
	}
	
	@Test
	public void testIterator() {
		//TODO
		/*
		Iterator tmp = acc.historyIterator();
		assertTrue(tmp.hasNext());
		assertEquals(acc.historyIterator(), acc.getHistory().iterator());
		*/
	}
	
	@Test (expected=IndexOutOfBoundsException.class)
	public void testToArray() {
		Operation a = new DepositOperation(20);
		Operation b = new WithdrawOperation(10);
		
		assertTrue(acc.addHistory(a));
		assertTrue(acc.addHistory(b));
		
		Operation[] operationarray = acc.historyToArray();
		assertEquals(operationarray[0],a);
		assertEquals(operationarray[1],b);
		// Exception
		@SuppressWarnings("unused")
		Operation c = operationarray[2];
		assertTrue(operationarray[0].getAmount() == 20);
		assertEquals(acc.historySize(),operationarray.length);
	}

}
