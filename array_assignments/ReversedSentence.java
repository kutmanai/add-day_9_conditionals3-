package array_assignments;

import java.util.Scanner;

public class ReversedSentence {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    String[] word=sentence.split(" ");
	    for(int i=word.length-1; i>=0;i--) {
	    	reversed=reversed +word[i]+" ";
	    }
	    
	    
	    

	    System.out.println(reversed );
	    
		
	}

}
