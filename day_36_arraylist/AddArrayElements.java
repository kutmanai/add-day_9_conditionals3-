package day_36_arraylist;

import java.util.Arrays;

public class AddArrayElements {

	public static void main(String[] args) {
		
         /*
          * 
          * addElements method name
          *  arg: 2 int arrays 
          *  return: int array
          *  Adds each element value of arg arrays and
          *   retunrn  a new array
          *   each arg array has 5 elemnts
          *   1->1,2,3,4,5,
          *   1->11,22,33,44,55
          *   
          */
		int [] num= {1,2,3,4,5};
		int[] num1= {11,22,33,44,55};
		
	int[] arr3=addElements(num,num1);
	System.out.println(Arrays.toString(arr3));
		
	}
	public static int[] addElements( int[] ints1, int[] ints2) {
		 //create a new array here
		int[] newArray=new int[ints1.length];
		//go to each elements in array and add them
		 for(int i=0; i<newArray.length; i++) {
			 newArray[i]=ints1[i] + ints2[i];
			 
		 }
		
		return newArray;
		
	}

}
