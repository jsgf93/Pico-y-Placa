package source.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Define "Placa" class

public class Placa {
//fields	
	private int licenseNumber;
	private int dayNumber;
	private boolean timeAllowed = true;
	
//getters and setters	
	public int getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public boolean isTimeAllowed() {
		return timeAllowed;
	}

	public void setTimeAllowed(boolean timeAllowed) {
		this.timeAllowed = timeAllowed;
	}

//methods	
	public int convertLicenseNumber(String license){
			license = license.substring(license.length() - 1);
			licenseNumber = Integer.parseInt(license);
		return licenseNumber;
	}
	
	public int convertDate(String date) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
	
			Date date1 = dateFormat.parse(date);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date1);
			dayNumber = cal.get(Calendar.DAY_OF_WEEK);
		
		return dayNumber;
	}
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
