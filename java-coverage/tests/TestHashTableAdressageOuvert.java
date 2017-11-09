package tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tablesAssociation.HashTableAdressageOuvert;
import tablesAssociation.ITableAssociation;

public class TestHashTableAdressageOuvert {
	
	private ITableAssociation htao;
	
	private static final String defkey = "key";
	private static final int defval = 5;

	@Before
	public void setUp() throws Exception {
		htao = new HashTableAdressageOuvert();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testPutGet() {
		assertNotNull(htao);
		htao.put(defkey, defval);
		assertEquals(htao.get(defkey), defval);
		
	}
	
	@Test
	public void testPutEcrase() {
		htao.put(defkey, defval);
		htao.put(defkey, defval*defval);
		
		assertEquals(htao.get(defkey), defval*defval);
	}
	
	@Test
	public void testGetVide() {
		assertEquals(htao.get(defkey), 0);
	}
	
	@Test
	public void testDeuxPut() {
		htao.put(defkey, defval);
		htao.put(defkey+defkey, defval+defval);
		
		assertEquals(htao.get(defkey), defval);
		assertEquals(htao.get(defkey+defkey), defval+defval);
	}
	
	@Test
	public void testCentPut() {
		String tmp = "";
		
		for (int i=0; i<100; i++) {
			tmp += defkey;
			htao.put(tmp, defval*i);
			assertEquals(htao.get(tmp), defval*i);
		}
	}
	
	@Test
	public void testMillePut() {
		String tmp = "";
		
		for (int i=0; i<1000; i++) {
			tmp += defkey;
			htao.put(tmp, defval*i);
			assertEquals(htao.get(tmp), defval*i);
		}
	}
}
