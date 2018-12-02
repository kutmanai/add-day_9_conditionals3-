package day_31_method02;

import java.util.Arrays;

public class ArraysAndString {

	public static void main(String[] args) {
		String[] groceryList= {"apple","carrot","cherry","strawberry"};
		 Arrays.sort(groceryList);
		 System.out.println("Index number of apple is " +Arrays.binarySearch( groceryList,"apple"));
		 System.out.println("Index number of strawberry " +Arrays.binarySearch(groceryList, "strawberry"));
 
		
		

	}

}
