package junit.test;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import process.services.Convertion;

public class DateTest {

	@Test
	public void testDate() throws ParseException {
		Convertion test = new Convertion ();
		//input
		int result = test.convertDate("2017-04-14");
		//output
		assertEquals(6,result); // The correct answer must be 6, because it is the number 
								//resultant of this transformation according to the function DAY_OF_WEEK
	}
}
