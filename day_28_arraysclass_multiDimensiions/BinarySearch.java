package day_28_arraysclass_multiDimensiions;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
           //	BinarySearch Method
		String[] words= {"cake","tomato","wooden spoon", "pizza"};
		Arrays.sort(words);
		//print all in one line:
		System.out.println(Arrays.toString(words));
		//find the index of pizza in the words array
		   System.out.println(Arrays.binarySearch(words,  "pizza") );

	}

}
