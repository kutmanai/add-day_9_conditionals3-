package mondaygroupproject_4;

import java.util.Scanner;

public class CodingTask6levelMedLCM {

	public static void main(String[] args) {
		
//		Level: med
//		Write a Java program to input two numbers from user and find LCM (Lowest Common
//		Multiple).
//		LCM is a smallest positive integer that exactly divides two or more numbers. For Example, the
//		LCM of 16 and 20 is 80; 80 is the smallest number that is both a multiple of 16 and a multiple of
//		20.
//		Input:
//		Enter First Number: 12
//		Enter Second Number: 30
//		Output:
//		LCM = 60


		
		      Scanner scan = new Scanner(System.in);
		      System.out.println("Enter first number:");
		      int num1=scan.nextInt();
		      System.out.print("Enter second number");
		      int num2=scan.nextInt();
		       int larger=0;
		       int smaller=0;
		       
		       if(num1>num2) {
		    	   larger=num1;
		    	   smaller=num2;
		    	   
		       }
		       int lcm=larger;
		       while(lcm %smaller !=0) {
		    	   lcm=lcm+larger;
		       }
		       
		       System.out.println("LCM=" +lcm);
		
		
	}

}
