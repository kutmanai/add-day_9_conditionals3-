package day_24arrays;

public class FindSmallestValue {

	public static void main(String[] args) {
		
		/*
		 * create array nums assign several values
		 * print the smallest value in array
		 * 
		 */
		
		 
		 int[]num= {12,45,67,89,9};
		 int smallest=num[0];
		 for( int num1:num) {
			 if(num1<smallest) {
				 smallest=num1;
				 System.out.println("Smallest value:" + smallest);
			 }
			 
			 
		 }
		 

	}

}
