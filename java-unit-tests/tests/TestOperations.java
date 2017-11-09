/**
 * 
 */
package tests;


import static org.junit.Assert.*;
import gestion.*;
import org.junit.*;


/**
 * @author Thibaud Colas
 *
 */
public class TestOperations {

	private Operation depop;
	private Operation witop;
	
	private float ini;
	
	@Before
	public void setUp() throws Exception {
		ini = 0;
		depop = new DepositOperation(ini);
		witop = new WithdrawOperation(ini);
	}
	
	public boolean compareSetGet(Operation op, float val) {
		op.setAmount(val);
		return op.getAmount() == val;
	}
	
	@Test
	public void testGetSetDep() {
		
		assertTrue(depop.getAmount() == ini);
		assertTrue(compareSetGet(depop, (float) 5.5));
		assertTrue(compareSetGet(depop, (float) -5.5));
	}
	
	@Test
	public void testGetSetWit() {
		
		assertTrue(witop.getAmount() == ini);
		assertTrue(compareSetGet(witop, (float) 5.5));
		assertTrue(compareSetGet(witop, (float) -5.5));
	}
	
	@Test
	public void testTypeDep() {
		assertEquals(depop.getOperationType(),"Deposit");
	}
	
	@Test
	public void testTypeWit() {
		assertEquals(witop.getOperationType(),"Withdraw");
	}
}
