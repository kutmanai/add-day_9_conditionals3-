package day_14_stringmanipulation;

import java.util.Scanner;

public class AddsThings {

	public static void main(String[] args) {
		//concat adds two strings together
		String domain="@cybertekschool.com";
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username ");
		String entry=scan.nextLine();
		System.out.println("This is your new email school email");
		//entry.concat(domain)===
		//entry.concat.(domain)=="A" + "B"
		System.out.println(entry.concat(domain));
		
		System.out.println("a".concat("b").concat("c").concat("d"));
		
		

	}

}
