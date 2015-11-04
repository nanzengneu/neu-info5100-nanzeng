package assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment5.HashMap.Entry;

public class HashMapTest {
	
	@Test
	public void test() {
		HashMap test = new HashMap();
		test.put("Nan", "IS");
		test.put("Yang", "IS");
		test.put("Vipin", "EM");
		test.put("Simon", "CS");
		Entry result = test.get("Nan");
		assertEquals("IS", result); 
	}

}
