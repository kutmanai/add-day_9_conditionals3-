package day_15stringmanipulationreview;

import java.util.Scanner;

public class Concentination {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" Please enter a numbers");
		 String one = scan.nextLine();
		 System.out.println("Enter a number");
		 String two=scan.nextLine();
		  int length=one.length();
		  System.out.println(length);
		 char last= one.charAt(length-1);// last char of the word
		 
		// char first;//first char of the second word 
		 
		 //if 
		System.out.println(last);
		char first =two.charAt(0);
		System.out.println("first:" +first);
		if (last==first) {
			System.out.println(one+two.substring(1));// print all of the first word + second word
			// without
			
			
		}else {
			System.out.println(one+two);
		}
		 

	}

}
// gives us a letter in a certain position ->system.charAt(6)
//length gives to us the length of a string exp;system.length(6-1)
//substring() -> return the word without the first char