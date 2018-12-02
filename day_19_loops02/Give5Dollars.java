package day_19_loops02;

import java.util.Scanner;

public class Give5Dollars {

	public static void main(String[] args) {
		   
		
		/*
		 * Ask for 5$ and check keep asking to enter for 5$ until you get or user
		 * enters it
		 */
		
		Scanner scan=new Scanner(System.in);
		int amount;
		 int tries=1; //it should give chance to give $5 max 3 times
		 do {
			 System.out.println("Please give me a 5$");
			 amount=scan.nextInt();
			 tries++;
		 }while(amount!=5  && tries<4);

		    System.out.println("Thank you for 5$");
	}

}
