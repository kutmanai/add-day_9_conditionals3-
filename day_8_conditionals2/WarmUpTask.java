package day_8_conditionals2;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in) ;
    System.out.println(" Hi What is your batch number? ");
    int batch = scanner.nextInt();
    if (batch ==10) {
    	System.out.println("We are classmates!");
    } else {
    	System.out.println(" "
    			+ "5Nice to meet you anyways. ");
    }
    
	
    int pincode  =1234;
    
    System.out.println(" Enter your pincode !");
    int inputPincode=scanner.nextInt();
    
    if (inputPincode== pincode) {
    	System.out.println("Say access granted !");
    	
    } else {
    	System.out.println("Access denied");
    	System.out.println("Incorrect pincode");
    	
    }
			
	System.out.println("Enter any number ");
	int number =scanner.nextInt();
	if (number % 2 !=0) {
		System.out.println(" Even number ");
		
	} else {
		System.out.println("Odd number");
		
	}
		
		
	
	}
 
}
