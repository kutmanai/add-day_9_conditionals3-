package day_21loops03;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		 /*accept a string if iy id palindrome, print palindrome if not print not palindrome
		  * step1 reverse the string java ajaj
		  * step2 compare reversed version with original
		 
		  * 
		  */
		//Scanner scan =new Scanner (System.in);
		//System.out.println("Print a words");
		
		 String word ="Level";
		 String reversed="";
		 
		 for(int idx=word.length()-1;  idx >=0; idx--) {
			// System.out.print(word.charAt(idx));
			 reversed +=word.charAt(idx);
		 }
		 System.out.println(reversed);
		 //System.out.println(word);
		  
		 
		  if(word.equalsIgnoreCase(reversed)) {
			  System.out.println("Palindrome");
		  }else {
			  System.out.println("Not Palindrome");
		  }
 
	}

}
