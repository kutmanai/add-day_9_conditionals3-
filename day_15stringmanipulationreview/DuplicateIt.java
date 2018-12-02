package day_15stringmanipulationreview;

import java.util.Scanner;

public class DuplicateIt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		String one = scan.nextLine();
		System.out.println("enter another word");
		String two = scan.nextLine();

		System.out.println(one + two + one + two);
	//	System.out.println(one.concat(two).concat(two).concat(one)); long way to print out
		// ctrl+shift+F shortcut for rormating code for windows
		// cmd+shift+f for mac

	}

}
