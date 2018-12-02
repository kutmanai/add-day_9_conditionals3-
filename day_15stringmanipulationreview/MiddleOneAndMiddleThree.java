package day_15stringmanipulationreview;

import java.util.Scanner;

public class MiddleOneAndMiddleThree {

	public static void main(String[] args) {
	
		
		
	
	
		Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a word");
	String entry=scan.nextLine();
	
	boolean isOdd=entry.length() %2 ==1;  //check if word has odd number of characters
	System.out.println("isOdd:" +isOdd);
	
	boolean has3ormore=entry.length() >=3;
	System.out.println("has 3 or more" +has3ormore);
	if (isOdd && has3ormore) {
		//print the character in the middle of the word
		//entry.length() -> whole length
		int length=entry.length();
		System.out.println("length:" +length);
		int mid =length/2;
		System.out.println("mid:" +mid);
		System.out.println(entry.charAt(mid));
	}

}
	
}
