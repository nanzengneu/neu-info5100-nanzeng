package assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CapitalizeFirstLetterTest {

	@Test
	public void testCapitalizeFirstLetter() {
		CapitalizeFirstLetter test = new CapitalizeFirstLetter();
		String result = test.upperCaseFirst("i love you forever");
		assertEquals("I Love You Forever", result);
	}

}
