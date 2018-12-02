package day_33ArraysAndMethod;

import java.util.Arrays;

public class ArraysWithMethods {

	public static void main(String[] args) {
		/*
		 * ARRAYS AND METHODS 1.Create method that accepts integer array and integer(target value) and returns integer array. 
		 * Logic: Method should initialize all the elements with given target integer value.Input: [1,4,23,4,0], 10Output: [10,10,10,10,10]
		 * 
		 */
		int [] arr= {23,12,43,23,5,3,1};
		
		 int [] newArray=initialize(arr,10);
		 System.out.println("Printing from main method after catching");
		 System.out.println(Arrays.toString(newArray));

		
		
	}
	public static int [] initialize(int[] num, int target) {
		System.out.println(Arrays.toString(num));
		System.out.println("Target: " +target);
		for(int i =0; i<num.length; i++) {
			num[i]=target;
			
			
			
			
			
		}
		System.out.println("After the loop:");
		System.out.println(Arrays.toString(num));
		
		
		return num;
	}
	
	/*
	 * Create method that accepts String and returns
	 * character array.
	 * input: "James"
	 * Output:[j,a,m,e,s]
	 * 
	 */
	//Create an  char array with the size of letters
	//loop through each letters annd assih=gn to each position of newly created char array.
	  public static char [] CharArray( String  word) {
		     int size = word.length();
		     System.out.println("Size " +size);
		     
		   
		  return null;
	  }

}
