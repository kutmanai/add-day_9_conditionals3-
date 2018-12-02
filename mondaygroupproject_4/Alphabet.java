package mondaygroupproject_4;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
//		Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
//
//		Input:
//		Input an alphabet: b
//		Output :
//		Input letter is Consonant
		
		 
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter  from English Alphabet: ");
			  String inputLetter="";
			  inputLetter=scan.next();
			 // inputLetter.equalsIgnoreCase(inputLetter);
			  
			     if(inputLetter.equalsIgnoreCase("a") || inputLetter.equalsIgnoreCase("e") 
						   
				   || inputLetter.equalsIgnoreCase("i") || inputLetter.equalsIgnoreCase("o") || inputLetter.equalsIgnoreCase("u")) {
					     
					   System.out.println(inputLetter + " is a VOWEL.");
				   }
				   else if( inputLetter.equalsIgnoreCase("b") || inputLetter.equalsIgnoreCase("c") || inputLetter.equalsIgnoreCase("d")
						   
						    || inputLetter.equalsIgnoreCase("f") || inputLetter.equalsIgnoreCase("g") || inputLetter.equalsIgnoreCase("h")
						    || inputLetter.equalsIgnoreCase("j") || inputLetter.equalsIgnoreCase("k") || inputLetter.equalsIgnoreCase("l")
						    || inputLetter.equalsIgnoreCase("m") || inputLetter.equalsIgnoreCase("n") || inputLetter.equalsIgnoreCase("p")
						    || inputLetter.equalsIgnoreCase("q") || inputLetter.equalsIgnoreCase("r") || inputLetter.equalsIgnoreCase("s")
						    || inputLetter.equalsIgnoreCase("v") || inputLetter.equalsIgnoreCase("x") || inputLetter.equalsIgnoreCase("z"))  {
					   System.out.println(inputLetter + " is a CONSONANT.");
				   } else {
					   System.out.println( "Invalid input");
				   }
			     
			    
		   
		
		
		

	}

}
