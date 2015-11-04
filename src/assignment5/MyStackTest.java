package assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void testMyStack() {
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 13;
		MyStack test = new MyStack(a);
		boolean result1 = test.empty();
		assertEquals(false, result1);
		int result2 = test.top();
		assertEquals("2", result2);
			
	}

}
