package day_36_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListWitIntegerNumbers {

	public static void main(String[] args) {
		
//		Create a program that asks integer of age from user using Scanner
//		and add 4 ages to the Integer of List. And print out the ages.
		Scanner scan= new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<4; i++) {
			System.out.println("Please enter your age"+(i+1) + ":");
			
			
			list.add(scan.nextInt());	
			
			
		}
		System.out.println(list);
		
		
		
		
		
	}

}
