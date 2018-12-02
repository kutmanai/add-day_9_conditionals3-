package array_assignments;

import java.util.Scanner;

public class gmhg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  
		  words[i] = input.nextLine();
		  
		  
		}
		String largest=words[0];
		
		for(int j=0; j<words.length; j ++) {
			if(words[j].length()>largest.length()) {
				largest=words[j];
		
			}
			
			
		}
		System.out.println(largest);
	
		  

	}
}