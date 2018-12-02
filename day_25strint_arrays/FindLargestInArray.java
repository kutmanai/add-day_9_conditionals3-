package day_25strint_arrays;

import java.util.Scanner;

public class FindLargestInArray {

	public static void main(String[] args) {
		/*
		 * ask user  to enter  how many items in array
		 * 
		 * 
		 */
		 Scanner scan=new Scanner(System.in);
		 System.out.println("How many items in Array ?");
		 int count=scan.nextInt();
		 //create  array called numbers with that capacity 
		  int[]numbers=new int [count];
		   // using a loop enter a values one by one
		  for ( int i=0; i<count; i++) {
		  System.out.println(" Enter number" +(i+1));
		  numbers[i]=scan.nextInt();
		  
		 
		  }
		   for(int n:numbers) {
			   System.out.print(n + " ");
			   
		   }
		   System.out.println();
		   
		   /*
		    *  iterate in array and find the largest value
		    *  
		    * 
		    */
		   
		       int largest=numbers[0]; //assume that first one is largest
		       /*
		        * 
		        * loop through the rest and check if they are greater than value of largest
		        * if true -> assign that value into largest.
		        * print out "largest:" + largest after the loop.
		        * 
		        */
		        for(int num:numbers) {
		        	if(num>largest) {
		        		largest=num;
		        		
		        	}
		        	  
		        }
		        System.out.println("Largest value:" + largest);
		       
		        System.out.println();
		        
	
		
	}

}
