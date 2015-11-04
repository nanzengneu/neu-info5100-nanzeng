package assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment5Test {
	int[] list1 = {2, 3, 4, 5, 6, 3, 4, 5, 6};
	String pattern = "abba";
	String str1 = "dog cat cat dog";
	String str2 = "dog fish cat fish";
	String s1 = "()[]{}";
	String s2 = "(]";

	@Test
	public void testSingleNumber() {
		Assignment5 test1 = new Assignment5();
		int result1 = test1.singleNumber(list1);
		assertEquals(2, result1);
	}
	
	@Test
	public void testWordPattern() {
		Assignment5 test2 = new Assignment5();
		boolean result2 = test2.wordPattern(pattern, str1);
		assertEquals(true, result2);
		boolean result3 = test2.wordPattern(pattern, str2);
		assertEquals(false, result3);
	}

	@Test
	public void testIsValid() {
		Assignment5 test3 = new Assignment5();
		boolean result4 = test3.isValid(s1);
		assertEquals(true, result4);
		boolean result5 = test3.isValid(s2);
		assertEquals(false, result5);
	}
}
