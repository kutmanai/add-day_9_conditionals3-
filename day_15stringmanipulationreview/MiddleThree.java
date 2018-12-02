package day_15stringmanipulationreview;

import java.util.Scanner;

public class MiddleThree {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type word");
		String word = scan.next();
		int wordCount=word.length();
		boolean isOdd=wordCount %2==1;
		boolean has5ormore=wordCount>=5;
		if(isOdd && has5ormore) {
			int beginIndex=(wordCount-3) /2;
			int endIndex=(wordCount+3) /2;
			String substring=word.substring(beginIndex,endIndex);
			System.out.println(substring);
			
		}else {
			System.out.println("Your word lenth do not match to odd number or less than 5 ");
		}
	scan.close();
	
	
	}

}
