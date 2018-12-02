package day_21loops03;

import java.util.Scanner;

public class FindHowManyTimes {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter word");
		 
		String word=scan.next().toLowerCase();
		System.out.println("Enter character:");
		char ch=scan.next().toLowerCase().charAt(0);
		int counter =0;
		for (int i=0; i <word.length(); i++) {
			//System.out.println(word.charAt(i));
			
			if(word.charAt(i)==ch) {
				//System.out.println("found c");
				counter++;
			}
		}
		System.out.println(counter);

		
	}

}
