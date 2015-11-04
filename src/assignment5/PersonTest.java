package assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person nan = new Person("Nan", "Zeng");
		Person nz = nan;
		assertEquals(nan.compareTo(nz), 0);
	}

}
