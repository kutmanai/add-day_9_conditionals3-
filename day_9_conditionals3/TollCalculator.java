package day_9_conditionals3;

import java.util.Scanner;

public class TollCalculator {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		  System.out.println(" TOLL COST CALCULATOR APPLICATION ");
		  System.out.println(" Enter distance you  will drive ");
		int miles = scan.nextInt();
		
		double tollCost =0.0;
		
		 if (miles >0  && miles <100) {
			 tollCost =5.0;
			 
		 } else if (miles >101 && miles <=500) {
			 tollCost=8.0;
			 
		 } else if (miles >=501 && miles <=1000) {
			  tollCost = 10.0;
		 }
			  else if (miles > 1000) {
				  tollCost = 12.0;
			  }
			  else {
				  System.out.println(" Cannot be negetive distance ");
				  
			  }
				  
				  if (miles > 0)
			    System.out.println(" your total cost for " +miles +" miles is "  + tollCost+ " $");
			  
		 
			 
		 
			 
		 }
		
			 
		
		 
	

}
