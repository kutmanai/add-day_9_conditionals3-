package day_33ArraysAndMethod;

import java.util.Scanner;

public class HellloString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password");
		String pass=scan.nextLine();
		 sayHello(pass);


	}
	 public static void  sayHello( String password) {
		 System.out.println(" This is the value: " +password);
		 //invisible stuff
		 if(password.equals("magic")) {
		  System.out.println("Hello, World");
		 }else {
			 System.out.println("password is invalid.Try again");
		 }
	 }

}
