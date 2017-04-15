package junit.test;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import source.dto.Placa;

public class TimeTest {

	@Test
	public void testTime() throws ParseException {
		Placa test = new Placa();
		boolean result = test.convertTime("06:00");
		assertEquals(true,result);
		boolean result1 = test.convertTime("08:00");
		assertEquals(false,result1);
		
		
	}

}
