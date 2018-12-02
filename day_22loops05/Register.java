package day_22loops05;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {

		/*
		 * MAC: command+shift+o is used for automatic import
		 *  INDENTATION select lines of code: TAB
		 *  IF you want to remove a tab: Select lines of code -> shift+tab
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" Welcome to our store -----:) \n");

		System.out.println("How many items you have?" );
		int itemsCount = scan.nextInt();

		// declare variable for all items and price for them

		String allItems = "";
		double totalPrice = 0;

		for (int i = 1; i <= itemsCount; i++) {
			System.out.println("What is item" +i+ "?");
			String item = scan.next();

			System.out.println(" How much is " + item + "?");
			double price = scan.nextDouble();
			if(i==itemsCount) {
				allItems=allItems+item;
			}else {
				allItems=allItems+item +",";
			}

			
			totalPrice = totalPrice + price;
		}
		System.out.println("Your items:" + allItems);
		System.out.println("Total price: $" + totalPrice);
		//System.out.println(;

	}

}
