package repl_it_assignments;

import java.util.Scanner;

public class VoidMethodsAssigment {

	public static void main(String[] args) {
//		Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.
//
//		enter number
//		1
//		next 3 are:
//		2 3 4
//
//		(put a space between numbers)
		Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	      next3(num);
	     
		
		
	}
	 public static void next3( int  numbers) {
		 for(int i=0; i<4; i++) {
			 System.out.println((numbers + i) + " ");
		 }
		 
		
	 }

}
