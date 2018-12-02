package day_15stringmanipulationreview;

import java.util.Scanner;

public class FirstAndLast {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two words");
		String bob =scan.nextLine();
		String system=scan.nextLine();
		System.out.println(bob.substring(0,1) + system.substring(system.length()-1));
		 bob.equalsIgnoreCase(bob);
		
	}

}
