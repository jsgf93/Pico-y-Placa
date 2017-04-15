package picoyplacaapp.main;

import java.text.ParseException;
import java.util.Scanner;

import process.services.*;
import source.dto.Placa;

public class PicoYPlacaApp {
	
	 private static Scanner reader;

	public static void main(String[] args) throws ParseException {
		 
		 reader = new Scanner(System.in);
		 System.out.println("\nEnter a valid license plate code, follow these formats: ABC-123, ABC-1234, AB-123 or AB-1234\n");
		 String licenseEntered = reader.nextLine();
		 System.out.println("\nEnter a valid date, follow this format: YYYY-MM-DD\n");
		 String dateEntered = reader.nextLine();
		 System.out.println("\nEnter a valid time, follow this format: HH:MM\n");
		 String timeEntered = reader.nextLine();		 
		 
		 // Instantiate classes.
	     Placa placa1 = new Placa();
	     Prediction prediction1 = new Prediction ();
	     Validate validate1 = new Validate (); 
	     
	     //Invoke methods
	     
	     // Validate input
	     if(validate1.licenseValidation(licenseEntered)==true && validate1.dateValidation(dateEntered)==true && validate1.timeValidation(timeEntered)==true){
	     //Predict Pico y Placa result
	    	 prediction1.predict(placa1.convertLicenseNumber(licenseEntered), placa1.convertDate(dateEntered), placa1.convertTime(timeEntered));
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
	 

	
	


