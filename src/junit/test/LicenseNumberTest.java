package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import process.services.Convertion;

public class LicenseNumberTest {

	@Test
	public void testLicenseNumber() {
		Convertion test = new Convertion();
		//input
		int result = test.convertLicenseNumber("ABC-1234");
		//output
		assertEquals(4,result);
	}

}
