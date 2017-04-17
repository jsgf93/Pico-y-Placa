package junit.test;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import process.services.Convertion;;

public class TimeTest {

	@Test
	public void testTime() throws ParseException {
		Convertion test = new Convertion();
		//input
		boolean result = test.convertTime("06:00");
		boolean result1 = test.convertTime("08:00");
		//output
		assertEquals(true,result);
		assertEquals(false,result1);
	}
}
