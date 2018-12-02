package day_28_arraysclass_multiDimensiions;

import java.util.Scanner;

public class SplitWords {

	public static void main(String[] args) {
//		Given a String variable sentence, write code to type each word in separate lines.
//
//		Example:
//		sentence -> "Java is fun"
//		Print
//		Java
//		is
//		fun
		
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    String [] word=sentence.split(" ");
	    for(int i=0; i<word.length; i++) {
	    	 System.out.println(word[i]);
	    }
	    
	    
	      
	    
	    
	    
	}

}
