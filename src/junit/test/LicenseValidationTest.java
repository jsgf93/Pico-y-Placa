package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import process.services.Validate;

public class LicenseValidationTest {

	@Test
	public void testLicenseValidation() {
		Validate test = new Validate();
		boolean result = test.licenseValidation("ABC-123");
		assertEquals(true, result);
		boolean result1 = test.licenseValidation("ABC-1234");
		assertEquals(true, result1);
		boolean result2 = test.licenseValidation("AB-123");
		assertEquals(true, result2);
		boolean result3 = test.licenseValidation("AB-1234");
		assertEquals(true, result3);
	}

}
