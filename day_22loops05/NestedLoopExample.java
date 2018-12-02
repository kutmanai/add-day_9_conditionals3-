package day_22loops05;

public class NestedLoopExample {

	public static void main(String[] args) {
		
		// write a program that prints numbers from 1 to 10 in same line 
		// separated by space . FOR LOOP
		// Add one more for loop and put everything from 17-17.
		// needs to loop 5 times
		
		 for(int j=1; j <=0; j++) {
		 for(int i=1; i<=10; i++) {
			 System.out.print(i + " ");
	 }
		  System.out.println();
		  		 }
	 
		 System.out.println("Outside the loop");
		 
		 /* Modify  nested loops above so that it print this pattern:
		  * 1
		  * 12
		  * 123
		  * 1234
		  * 12345
		  * 123456
		  * 1234567
		  * 12345678
		  * 123456789
		  * 12345678910
		  * 
		  */
		 for(int j=1; j <=10; j++) {
			 for(int i=1; i<=j; i++) {
				 System.out.print(i + " ");
			 }
			  System.out.println();
			  
			 }
			 
			 System.out.println("Outside the loop");
			 
			 /*
			  * 
			  * 
			  * 
			  */
			 for (int outer=10; outer>=1; outer--) {
					for(int inner =1; inner<=outer; inner++) {
						System.out.print(inner + " ");
					}
					
					System.out.println();
				}
			 
			 
			 
			 
			 
			
				 

	}

}
