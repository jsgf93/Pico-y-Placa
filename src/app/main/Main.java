package app.main;

import java.text.ParseException;
import java.util.Scanner;

import process.services.*;
import source.dto.*;

public class Main {
	
	private static Scanner reader;
	
	public static void main(String[] args) throws ParseException {
		
		 //Instantiate classes.
	     LicensePlate licenseplate1 = new LicensePlate();
	     Date date1 = new Date();
	     Time time1 = new Time();
	     Prediction prediction1 = new Prediction ();
	     Validate validate1 = new Validate ();
	     Convertion convertion1 = new Convertion();
	     
		 //Get user input
		 reader = new Scanner(System.in);
		 System.out.println("\nEnter a valid license plate code, follow these formats: ABC-123, ABC-1234, AB-123 or AB-1234\n");
		 licenseplate1.setLicensePlateNumber(reader.nextLine());
		 System.out.println("\nEnter a valid date, follow this format: YYYY-MM-DD\n");
		 date1.setDate(reader.nextLine()); 
		 System.out.println("\nEnter a valid time, follow this format: HH:MM\n");
		 time1.setTime(reader.nextLine());	 
		   
	     // Validate user input
	     if(validate1.licenseValidation(licenseplate1.getLicensePlateNumber()) && validate1.dateValidation(date1.getDate()) && validate1.timeValidation(time1.getTime())){
	     
	    	 //Predict "Pico y Placa" result
	    	 prediction1.predict(convertion1.convertLicenseNumber(licenseplate1.getLicensePlateNumber()), convertion1.convertDate(date1.getDate()), convertion1.convertTime(time1.getTime()));
	    	 
	    	 //Ask for another prediction
	    	 System.out.println("\nDo you want to continue ? y/n\n");
	    	 String choice = reader.nextLine();
	    	 if(choice.equals("y") || choice.equals("Y")){
	    		 main(args);
	    	 }
	    	 else if(choice.equals("n") || choice.equals("N")){
	    		 System.out.println("\nGood bye!\n");
	    	 }
	    	 else {
		    	System.out.println("\nInvalid option, good bye!\n");
	    	 }
	    	 
	     }
	     
	     else{
	    	 System.out.println("\nDo you want to continue ? y/n\n");
	    	 String choice = reader.nextLine();
	    	 if(choice.equals("y") || choice.equals("Y")){
	    		 main(args);
	    	 }
	    	 else if(choice.equals("n") || choice.equals("N")){
	    		 System.out.println("\nGood bye!\n");
	    		 System.exit(0);
	    	 }
	    	 else {
	    		 System.out.println("\nInvalid option, good bye!\n");
	    		 System.exit(0);
	    	 }
		}
	}
}
	 

	
	


