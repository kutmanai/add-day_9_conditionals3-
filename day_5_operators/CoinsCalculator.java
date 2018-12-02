package day_5_operators;
import java.util.Scanner;
public class CoinsCalculator {

	public static void main(String[] args) {
		//int pennies =250;
		//int dollars=pennies /100;
		//System.out.println(dollars);
		//pennies %=100;
		//System.out.println(pennies);
		Scanner Keyboard = new Scanner (System.in);
		System.out.println("Enter count of pennies you have:");
		int pennies =Keyboard.nextInt();
		int dollars,quaters,dimes, nickels ,cents;
	   
		 dollars=pennies /100;
		 pennies %=100;
		 quaters=pennies /25;
         pennies %=25;
		 dimes =pennies/10;
		 pennies %=10;
		 nickels=pennies /5;
		 pennies %=5;
		 cents =pennies;
		 
		 pennies %=25;
		 System.out.println("Dollars: " + dollars);
		 System.out.println("quaters:" +quaters);
		 System.out.println("dimes: " + dimes);
		 System.out.println("nickels: " + nickels);
		 System.out.println("cents: " + cents);

		 	

}

}
