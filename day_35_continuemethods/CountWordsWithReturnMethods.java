package day_35_continuemethods;

import java.util.Arrays;
import java.util.Scanner;

public class CountWordsWithReturnMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a sentence:");
		String sentence=scan.nextLine();
		
        countWords(sentence);
	}
	public static void countWords( String str) {
		
		
		 String [] splitStr=str.split(" ");
		 String splitArr=Arrays.toString(splitStr);
		 System.out.println("The value of the split string is as followed:" +splitArr);
		 System.out.println("The number of sentence" + splitArr.length());
		 
		
	}

}
