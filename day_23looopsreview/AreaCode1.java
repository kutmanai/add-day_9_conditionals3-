package day_23looopsreview;

import java.util.Scanner;

public class AreaCode1 {

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter phone number");
		    String phoneNumber = scan.next();
		    
		    String areaCode="";
		    if(phoneNumber.startsWith("(")) {
		    	areaCode=phoneNumber.substring(1,4);
		    }else {
		    	areaCode=phoneNumber.substring(0,3);
		    			
		    }
		    System.out.println(areaCode);
		    String state;
		    
		    switch (areaCode) {
		    case "202" :
		    	state="Washington";
		    	break;
		    case "703":
		    	state="Virginia";
		    	break;
		    case "209":
		    	state ="California";
		    	break;
		    case "312":
		    	state="Illinois";
		    	break;
		    case "347":
		    	state="New York";
		    	break;
		    	default:
		    		state ="Not in database";
		    		break;
		    	
		    	
		    
		    }
		    System.out.println(state);


	}

}
