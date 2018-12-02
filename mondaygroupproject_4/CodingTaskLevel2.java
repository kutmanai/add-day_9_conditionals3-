package mondaygroupproject_4;

import java.util.Scanner;

public class CodingTaskLevel2 {

	public static void main(String[] args) {
//		Level: super easy
//		Write a Java program that reads in 3 numbers from the user in a loop (one at a time)
//		And prints largest number and the summation of all numbers
//		Input:
//		Enter number 1: 10
//		Enter number 2: 20
//		Enter number 3: 30
//		Output:
//		Largest number = 30
//		Sum = 60
		
		
		    Scanner scan =new Scanner(System.in);
		     int num1,num2,num3;
		     do {
		     System.out.println("Please  enter first  number")	;
		     num1=scan.nextInt();
		     System.out.println("Please enter  second number");
		     num2=scan.nextInt();
		     System.out.println("Please enter third number");
		     num3=scan.nextInt();
		      if(num1>num2 && num1>num3) {
		    	  System.out.println("Largest number:" + num1) ;
		      }else if (num2>num1 && num2>num3) {
		    	  System.out.println("Largest number:" +num2);
		      }else {
		    	  System.out.println("Largest number:" +num3);
		      }
		      System.out.println("Sum =" +(num1+num2+num3));
		    	 
		     }while(!(num1<0));
		

	}

}
