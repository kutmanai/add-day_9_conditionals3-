package day_14_stringmanipulation;

import java.util.Scanner;

public class StatingTheObvious {

	public static void main(String[] args) {
		// what is your email?
		//some @gmail.com
		//oh so you have gmail.
		  Scanner scan =new Scanner(System.in);
		  System.out.println("Please enter your email");
		  
		   String  entry=scan.nextLine();
		   
		   //donuldtheduck@gmail.com
		   
		   //
		
		  // System.out.println(entry.substring(14,19));
		   //1 find the location of @ sign
		   //
		   //substring usng those two locations
		   //it is getting the location of the @ sign and adding one
		   //if we dont add 1, it will include @sign in the substring
		   int start =entry.indexOf("@")+1;
		   System.out.println(start);
		   System.out.println(entry.substring(start));
		   int end =entry.indexOf(".");
		   System.out.println( "Oh so you hava a" +entry.substring(start,end));
	}

}
