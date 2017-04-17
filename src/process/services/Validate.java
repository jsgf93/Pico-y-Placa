package process.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Validate {
	
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	private Scanner sc;
	private Scanner sc2;
	
	//This method validate the license plate number using a regex that allows only 
	//these formats: AB-123, AB-1234, ABC-123 and ABC-1234. No blank spaces allowed.  
	public boolean licenseValidation(String license){
		   
		sc = new Scanner(license);
		if (!sc.hasNext("^[a-zA-Z]{2,3}-([0-9]){3,4}$")) {
		    System.out.println(sc.next()+" is not a valid license plate number!\n");
		    return false;
		}
		else{
			String license1 = sc.next();
			System.out.println(license1+" is a valid license plate number.\n");
			return true;
		}	
	}

	//This method validate the date using a parse function.
	public boolean dateValidation(String date){
		try {
	          format.parse(date);
	          System.out.println(date+" is a valid date.\n");
	          return true;
	     }
	     catch(ParseException e){
	    	 System.out.println(date+" is not a valid date!\n");
	    	 return false;
	     }
		}

	//This method validate the time using a regex that allows only real times in
	//this format: HH:MM
	public boolean timeValidation(String time){
		   
		sc2 = new Scanner(time);
		if (!sc2.hasNext("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")) {
		    System.out.println(sc2.next()+ " is not a valid time!\n");
		    return false;
		}
		else{
			String time1 = sc2.next();
			System.out.println(time1+" is a valid time.\n");
			return true;
		}
	}		
}


