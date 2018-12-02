package day_15stringmanipulationreview;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		       Scanner scan =new Scanner(System.in) ;
		      System.out.println("Please enter a new  password");
		        String password=scan.nextLine();
		       String newPassword= "kutman@i91";
		       
		       
		       if (password.equalsIgnoreCase(newPassword)) {
		    
		    	   System.out.println("your password is accepted");
		       }else if (!password.equalsIgnoreCase(newPassword)) {
		    	   System.out.println("error: invalid password");
		       } else {
		    	   System.out.println("not accepted characters");
		       }


	}

}
