package day_28_arraysclass_multiDimensiions;

import java.util.Scanner;

public class ArraysPrintFirstAndLastCharWithString {

	public static void main(String[] args) {
		
   //Given , a String array words, iterate through each
		//word and print first and last letter of each element in seperate lines.
		
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
		
		 // String [] words= {"hello","why","by","apple","note"};
	    
	     for( String word:words) {
	    	 System.out.print(word.charAt(0));
	    	 System.out.println(word.charAt(word.length()-1));
	    	  System.out.println(word.charAt(0)+ ""+ word.charAt(word.length()-1));
	    	 
	     }
	    
	    
	   


	}

}
