package process.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Validate {
	
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	private Scanner sc;
	private Scanner sc2;
	
	public boolean licenseValidation(String license){
		   
		sc = new Scanner(license);
		if (!sc.hasNext("^[a-zA-Z]{2,3}-([0-9]){3,4}$")) {
		    System.out.println("That's not a valid license plate number!\n");
		    sc.next();
		    return false;
		}
		String license1 = sc.next();
		System.out.println(license1+" is a valid license plate number.\n");
		return true;
	}
	
	public boolean dateValidation(String date){
		try {
	          format.parse(date);
	          System.out.println(date+" is a valid date.\n");
	          return true;
	     }
	     catch(ParseException e){
	    	 System.out.println("That's not a valid date!\n");
	    	 return false;
	     }
		}
	
	public boolean timeValidation(String time){
		   
		sc2 = new Scanner(time);
		if (!sc2.hasNext("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")) {
		    System.out.println("That's not a valid time!\n");
		    sc2.next();
		    return false;
		}
		String time1 = sc2.next();
		System.out.println(time1+" is a valid time.\n");
		return true;
	}
		
		
}


