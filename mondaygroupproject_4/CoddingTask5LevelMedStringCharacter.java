package mondaygroupproject_4;

import java.util.Scanner;

public class CoddingTask5LevelMedStringCharacter {

	public static void main(String[] args) {
		
//		Level: easy/med
//		Write a Java program which accepts a string from user and print the string such that each
//		character in the string is printed two times.
//		Input:
//		Hello
//		Output:
//		HHeelllloo
//		Input:
//		Hi-there
//		Output:
//		HHii--tthheerree
//		
		  
		    Scanner scan =new Scanner(System.in);
		    System.out.println("Please  enter a words");
		    String word=scan.next();
		    for( int i=0; i<=word.length()-1; i++) {
		    	word.equalsIgnoreCase(word);
		    	System.out.print(word.charAt(i)+""+word.charAt(i));
		    	
		    }

		
		
		
		    
	}

}
