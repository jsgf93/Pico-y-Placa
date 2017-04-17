package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import process.services.Validate;

public class LicenseValidationTest {

	@Test
	public void testLicenseValidation() {
		Validate test = new Validate();
		//input
		boolean result = test.licenseValidation("ABC-123");
		boolean result1 = test.licenseValidation("ABC-1234");
		boolean result2 = test.licenseValidation("AB-123");
		boolean result3 = test.licenseValidation("AB-1234");
		//output
		assertEquals(true, result);
		assertEquals(true, result1);
		assertEquals(true, result2);
		assertEquals(true, result3);
	}

}
