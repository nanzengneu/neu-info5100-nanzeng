package midtermExam;

import static org.junit.Assert.*;

import org.junit.Test;

public class MidtermExamTest {
	int[] list1 = {0, 1, 0, 3, 12};
	int[] list2 = {0, 3, 7, 8, 6, 4, 3, 0, 9};
	int[] list3 = {2, 7, 11, 15};
	
	@Test
	public void testPrintFizzBuzz() {
		MidtermExam test1 = new MidtermExam();
		String result1 = test1.printFizzBuzz(15);
		assertEquals("fizz buzz", result1);
	}
	
	@Test
	public void testMoveZeros() {
		MidtermExam test2 = new MidtermExam();
		String result2 = test2.moveZeroes(list1);
		assertEquals("[1, 3, 12, 0, 0]", result2);
	}
	
	@Test
	public void testIsAnagram() {
		MidtermExam test3 = new MidtermExam();
		boolean result3 = test3.isAnagram("anagram", "nagaram");
		assertEquals(true, result3);
	}
	
	@Test
	public void testContainsDuplicate() {
		MidtermExam test4 = new MidtermExam();
		boolean result4 = test4.containsDuplicate(list2);
		assertEquals(true, result4);
	}
	
	@Test
	public void testTwoSum() {
		MidtermExam test5 = new MidtermExam();
		boolean result5 = test5.twoSum(list3, 9);
		assertEquals(true, result5);
	}
}
