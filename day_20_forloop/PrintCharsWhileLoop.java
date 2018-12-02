package day_20_forloop;

import java.util.Scanner;

public class PrintCharsWhileLoop {

	public static void main(String[] args) {
		  /*
		   * Write a pogram that accept a string word and using while loop and charAt print 
		   * each char in separate line.
		   */
		 Scanner scan= new Scanner(System.in);
		 System.out.println("Enter word");
		 String word = scan.next();
		 int index=0;
		 while(index<word.length()) {
			 System.out.println(word.charAt(index));
			 index++;
			 // to do : rewrite the code  with substring
		 }

	}

}
