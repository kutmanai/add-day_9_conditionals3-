package day_33ArraysAndMethod;

import java.util.Arrays;

public class AcceptsStringArray {

	public static void main(String[] args) {
		 /*  Create method that accepts String array and integer
		  * (size) that prints out Strings with the given size.
		  * input: ["James","john","Adam","Brian"]5
		  * output: James
		  * 
		  * 
		  */

		   String [] names= {"James","Adam","Obama","Obama care"}; 
		   printsWordsWithSize(names,5);
		  // System.out.println(Arays.toString(names));

	}
	
	public static void printsWordsWithSize(String[] words , int size) {
		for(String word:words) {
			if(word.length()==size) {
				System.out.println(word);
			}
			
		}
		    
		
		
	}

}
