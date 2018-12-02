package day_12_object_strings;

import java.util.Scanner;

public class GetBeverage {

	public static void main(String[] args) {
		int tea=3;
		int coffee=4;
		int water=2;
		int juice=5;
		
	
		double price=0.0;
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Choose your drink:");
		 String drink=scan.next();
		 
		switch  (drink) { 
		
		case "tea":
			price =3;
			
			break;
		case "coffee":
			price=4;
			break;
		case "water":
			
			price=2;
			break;
		case "juice":
			
			price=5.0;
			break;
			default:
			
				 System.out.println("Invalid drink");
				 return;
				 
		}
		System.out.println(" Your total is " +price +"$");
		
		
		

	}

}
