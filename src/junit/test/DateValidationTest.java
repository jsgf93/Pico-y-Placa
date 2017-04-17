package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import process.services.Validate;

public class DateValidationTest {

	@Test
	public void testDateValidation() {
		Validate test = new Validate();
		//input
		boolean result = test.dateValidation("2017-01-15");
		boolean result1 = test.dateValidation("201701-15");
		//output
		assertEquals(true,result);
		assertEquals(false,result1);
	}
}
