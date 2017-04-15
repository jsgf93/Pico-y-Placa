package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import process.services.Validate;

public class TimeValidationTest {

	@Test
	public void testTimeValidation() {
		Validate test = new Validate();
		boolean result = test.timeValidation("19:00");
		assertEquals(true,result);
		boolean result1 = test.timeValidation("1900");
		assertEquals(false,result1);

	}

}
