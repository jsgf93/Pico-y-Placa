package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import process.services.Validate;

public class DateValidationTest {

	@Test
	public void testDateValidation() {
		Validate test = new Validate();
		boolean result = test.dateValidation("2017-01-15");
		assertEquals(true,result);
		boolean result1 = test.dateValidation("201701-15");
		assertEquals(false,result1);
		
	}

}
