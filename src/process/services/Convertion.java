package process.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Convertion {
	
	private int licenseNumber;
	private int dayNumber;
	private boolean timeAllowed = true;
	
	//This method gets the last digit of the license plate number as a string
	//and transforms it to an integer.
	public int convertLicenseNumber(String license){
		license = license.substring(license.length() - 1);
		licenseNumber = Integer.parseInt(license);
		return licenseNumber;
	}
	
	//This method gets the date as a string and transforms it to a date type  in this format: YYYY-MM-DD.
	//Then gets the day of the week that the date entered represents and returns a number,
	//according to the day.
	public int convertDate(String date) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		Date date1 = dateFormat.parse(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		dayNumber = cal.get(Calendar.DAY_OF_WEEK);
		return dayNumber;
	}
	
	//This method gets the date as a string and transforms it to a time type  in this format: HH:MM. 
	//Then compares it with the hours  that the "Pico y Placa" applies and returns false if the car 
	//should not be on the road.
	public boolean convertTime(String time) throws ParseException{
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
		Date seven = timeFormat.parse("06:59");
		Date nine = timeFormat.parse("09:31");
		Date sixteen = timeFormat.parse("15:59");
		Date nineteen = timeFormat.parse("19:31");
		Date time1 = timeFormat.parse(time);
		if ((time1.after(seven) && time1.before(nine))||(time1.after(sixteen) && time1.before(nineteen))){
			timeAllowed = false;
		}
		return timeAllowed;	
	}
}
