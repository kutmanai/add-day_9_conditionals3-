package repl_it_assignments;

import java.util.Arrays;

public class ArraysFindNonDuplicate {

	public static void main(String[] args) {
	/*
	 * 
	 * Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2
	
	 */

		
		int arr[] = {1,1,2,3,4,3,4};
            
		for(int outer=0; outer<arr.length;outer++) {
			int currentNum=arr[outer];
			boolean duplicate=true;
			for(int inner=0; inner<arr.length; inner++) {
				if(arr[inner]==currentNum && outer !=inner) {
					duplicate=false;
					break;
				}
			}
			if(duplicate) {
				System.out.print(" Output:" + currentNum + " ");
			}
		}
		
	}

}
