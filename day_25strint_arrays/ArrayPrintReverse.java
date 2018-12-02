package day_25strint_arrays;

import java.awt.Point;

public class ArrayPrintReverse {

	public static void main(String[] args) {
		 
		/* Create int array scores and assign 10 different scores
		 * between 0 and 100
		 * 
		 */
		   
		
		
		 int[] scores= {10,20,30,40,50,60,70,80,90,100};
		 //check if 10 points and say 10 points found
		 if(scores.length==10) {
		  System.out.println("10 points found");
		  //System.out.println(scores[1]);
		  //System.out.println(scores[9]);
		  
		 }else {
			 System.out.println("We need 10 points");
		 }
			 for(int i=scores.length-1; i>=0; i--) {
				 System.out.print(scores[i] + " ");
			 
			 
		 }
			 System.out.println("\n-------WHILE LOOP------");
			 
			  int idx=scores.length-1;
			  
			  while(idx>=0) {
				  System.out.print(scores[idx--] + " ");
				  //m nb         idx--;
			  }
		 
		 
		 /*1. using a for  loop print each item in reverse order in same line
		  * separated by space
		  * 2.using a while loop print each item in reverse order in same line ,
		  * separated by space
		  * 
		  * 
		  */
		 
		  

	}

}
