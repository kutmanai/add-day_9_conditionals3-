package day_30_methods01;

import java.util.Arrays;
import java.util.Scanner;

public class Amazon_void {

	public static void main(String[] args) {
		
   System.out.println(" This is Amazon Application");
   System.out.println("Please login");
   System.out.println("username: ");
   Scanner scan = new Scanner(System.in);
   String username=scan.nextLine();
   System.out.println("password:");
   String pass = scan.nextLine();
   welcome(username);
   System.out.println(username);
   System.out.println(username.hashCode());
   System.out.println("\n\nEnd of Amazon program");

	}
	//Create a method that accepts String and says " Welcome , user"
	
	public static void welcome(String user) {
		System.out.println("Welcome, " + user + "!!!");
		user=user.substring(0,2);
		System.out.println(user.hashCode());
		System.out.println("modified user :" + user);
		
	}

}
