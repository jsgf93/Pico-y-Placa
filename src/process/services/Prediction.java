package process.services;

public class Prediction {
	
	//This method predicts whether or not a car with a specific license plate number
	//can be on the road at a specific date and time. First, it uses a switch function 
	//to compare the last digit of the license plate number entered, then if the number
	//fits in a case depending on the "peak and plate" specifications, the date and time
	//are used to get the correct prediction.
	public void predict(int userLicense, int userDate, boolean userTime){
			 switch (userLicense) {
	            case 1:  
	            	if (userDate == 2 && userTime == false){
	            		System.out.println("This car CANNOT be on the road!");
	            	}
	           		else{
	           				System.out.println("This car can be on the road.");
	           		}
	            break;
	            case 2:  
	            	if (userDate == 2 && userTime == false){
	            		System.out.println("This car CANNOT be on the road!");
	            	}
	            	else{
	            		System.out.println("This car can be on the road.");
	            	}
	            break;
	            case 3:  
	            	if (userDate == 3 && userTime == false){
	            		System.out.println("This car CANNOT be on the road!");
	            	}
	           		else{
	           				System.out.println("This car can be on the road.");
	           		}
	            break;
	            case 4:  
	            	if (userDate == 3 && userTime == false){
	            		System.out.println("This car CANNOT be on the road!");
	            	}
	            	else{
	            		System.out.println("This car can be on the road.");
	            	}
	            break;
	            case 5:  
	            	if (userDate == 4 && userTime == false){
	            		System.out.println("This car CANNOT be on the road!");
	            	}
	           		else{
	           				System.out.println("This car can be on the road.");
	           		}
	            break;
	            case 6:  
	            	if (userDate == 4 && userTime == false){
	            		System.out.println("This car CANNOT be on the road!");
	            	}
	            	else{
	            		System.out.println("This car can be on the road.");
	            	}
	            break;
	            case 7:  
	            	if (userDate == 5 && userTime == false){
	            		System.out.println("This car CANNOT be on the road!");
	            	}
	           		else{
	           				System.out.println("This car can be on the road.");
	           		}
	            break;
	            case 8:  
	            	if (userDate == 5 && userTime == false){
	            		System.out.println("This car CANNOT be on the road!");
	            	}
	            	else{
	            		System.out.println("This car can be on the road.");
	            	}
	            break;
	            case 9:  
	            	if (userDate == 6 && userTime == false){
	            		System.out.println("This car CANNOT be on the road!");
	            	}
	           		else{
	           				System.out.println("This car can be on the road.");
	           		}
	            break;
	            case 0:  
	            	if (userDate == 6 && userTime == false){
	            		System.out.println("This car CANNOT be on the road!");
	            	}
	            	else{
	            		System.out.println("This car can be on the road.");
	            	}
	            break;
	            default: System.out.println("ERROR!");
	            break;
		        }
		}
}