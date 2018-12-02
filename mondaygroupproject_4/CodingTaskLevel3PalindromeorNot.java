package mondaygroupproject_4;

import java.util.Scanner;

public class CodingTaskLevel3PalindromeorNot {

	public static void main(String[] args) {
		
//		Level: easy/med
//		Write a Java program which accepts a number from user and check if the number is palindrome
//		or not?
//		A palindrome number is a number which remains the same when it is reversed.
//		Input:
//		16461
//		Output:
//		Palindrome number
//		Input:
//		123
//		Output:
//		Not a Palindrome number
//		
		
		int num=121, reversedInteger=0, remainder, originalInteger;
		originalInteger=num;
		//reversed integer is stored in variable
		for(;num !=0; num/=10) {
			remainder=num %10;
			reversedInteger=reversedInteger *10 +remainder;
		}
		// palindrome if originalInteger and reversedInteger are equal
		
	     if(originalInteger==reversedInteger)
	    	 System.out.println(originalInteger +  " is a Palindrome");
	     else 
	    	 System.out.println(originalInteger + " is not a Palindrome");
		
		
		
		   
		
		
		
		
		
	}

}
