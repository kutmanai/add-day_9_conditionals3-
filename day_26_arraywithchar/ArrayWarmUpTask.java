package day_26_arraywithchar;

public class ArrayWarmUpTask {

	public static void main(String[] args) {
		
//		1) Write a program called IncrementArrayValues:
//
//			1. Declare array nums and assign {1,2,3,4,5,6,7,8,9}
//
//			2. Print out all values in single line separated by space:
//
//			1 2 3 4 5 6 7 8 9
//
//			3. Using a Loop write some code to do the following:
//
//			       if the value is even - double it and assign back. If the value is odd - triple it and assign back.
//
//			4. Print out all values in single line separated by space:
//
//			3 4 9 8 15 12 21 16 27
//
//		  int[] nums= {1,2,3,4,5,6,7,8,9};
//		   for ( int number:nums) {
//		  System.out.print(number + " ");
//		  
//		  
//		
//		   }
		     
		     double [] n= {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		     double even=0;
		     double odd=0;
		
		    for(  double num:n) {
		    	if(num==0.0) {
		    		even=num;
		     System.out.println("Even");	
		    	}else {
		    		System.out.println("Odd");
		    	}
		    }

	}

}
