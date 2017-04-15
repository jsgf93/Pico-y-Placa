package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import source.dto.Placa;

public class LicenseNumberTest {

	@Test
	public void testLicenseNumber() {
		Placa test = new Placa();
		int result = test.convertLicenseNumber("ABC-1234");
		assertEquals(4,result);
	}

}
