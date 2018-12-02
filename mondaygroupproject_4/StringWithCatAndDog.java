package mondaygroupproject_4;

import java.util.Scanner;

public class StringWithCatAndDog {

	public static void main(String[] args) {
		
//		Level: med
//		Write a Java program to input a string from user and prints true if ‘cat’ and ‘dog’ appears the
//		same number of times in the given string.
//		Input:
//		catdog
//		Output:
//		True 
//		Input:
//		catcat
//		Output:
//		False
//		Input:
//		1cat1cadodog
//		Output:
//		True
//		      
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your  word");
		String word=scan.next().toLowerCase();
		int cat =0;
		int dog=0;
		
		for( int j=0; j<word.length()-2;j++) {
			if(word.substring(j,j+3).equals("cat")) {
				cat++;
				
			}
			
			if(word.substring(j,j+3).equals("dog")) {
			      dog++;
			}
		}
		
            if (cat==dog) {
            	System.out.println("true");
            }else {
            	System.out.println("false");
            }
		
		
		
		                  
		
		 
		
		
		
		
	}

}
