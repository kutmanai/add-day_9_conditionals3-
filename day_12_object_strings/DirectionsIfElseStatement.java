package day_12_object_strings;

import java.util.Scanner;

public class DirectionsIfElseStatement {

	public static void main(String[] args) {
		
		System.out.println(" Give a directions");
		char start, end;
		 start='C';
		 end ='D';
		 if (!(start >= 'A' && start <='D' && end >='A' && end <='D')) {
			 System.out.println("Invalid start or end");
		 }else if (start==end) {
			 System.out.println("Already there");
			 
		 } else if(start=='A') {
			 if(end=='B') {
				 System.out.println("Go right");
			 } else if (end=='C') {
				 System.out.println("Go right and go down");
			 } else if(end=='D') {
				 System.out.println("Go rihght go down go left");
			 }
		 }
			
		 
		 
		 }
			 
		 
		

}
