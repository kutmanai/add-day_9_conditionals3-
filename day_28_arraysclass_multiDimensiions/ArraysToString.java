package day_28_arraysclass_multiDimensiions;

import java.util.Arrays;

public class ArraysToString {

	public static void main(String[] args) {
		//toString method is present in all java classes, and it is used to describe the object
		
		int[]nums= {7,32,5,23};
		 System.out.println(Arrays.toString(nums));
		 
		 //sort this array
		 
		 Arrays.sort(nums);
		 System.out.println(Arrays.toString(nums));
		 
		 
	}

}
