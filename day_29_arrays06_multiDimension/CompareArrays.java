package day_29_arrays06_multiDimension;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		   int [] arr1= {56,23,656,67};
		   System.out.println(Arrays.toString(arr1));
		   //1 scenario
		   int[] arr2=arr1;
		   System.out.println(Arrays.toString(arr2));
		   
		   System.out.println(arr1==arr2);
		   System.out.println(Arrays.equals(arr1, arr2));
		   
		   //2
		   int arr3[]= {56,23,656,67};
		   System.out.println(arr1==arr3); //false //check if arr1 and arr3 looking at same memory location
		   System.out.println(Arrays.equals(arr1, arr3));//true
		    //with String
		   String str1=new String ("hello");
		   String str2= new String("hello");
		   System.out.println(str1==str2);
		   System.out.println(str1.endsWith(str2));
		   
		   
		   
		   
		   
		   
		   
		   


	}

}
