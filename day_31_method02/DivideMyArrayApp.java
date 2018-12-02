package day_31_method02;

import java.util.Arrays;
import java.util.Scanner;

public class DivideMyArrayApp {

	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		  System.out.println(" Welcome to divide my Array!");
		  System.out.println("Enter numbers for your array:" ) ;
		  int size=scan.nextInt();
		  int [] numbers= new int[size];
		 
		  for(int i=0; i<numbers.length; i++) {
			  numbers[i]=scan.nextInt();
		
			  
			  
		  }
		  System.out.println("The string value of your array:" + Arrays.toString(numbers));
		  int[] firstHalf=Arrays.copyOfRange(numbers,0, numbers.length/2);
		  int [] secondHalf=Arrays.copyOfRange(numbers, numbers.length/2,numbers.length);
		  System.out.println("The first half of your array is " +Arrays.toString(firstHalf)) ;
		  System.out.println("The second half of your array is " + Arrays.toString(secondHalf));

	}

}
