package day_31_method02;

import java.util.Arrays;

public class MethodsWithConditions {

	public static void main(String[] args) {
		getLarger(100,40);
		int[] arr= {100,3000,40};
		getMax(arr);
		getMax(new int[] {345,678,890,5000} );
		 getMax ( new int [] {});
		 int [] arr2=new int [] {};
		getMax(arr2);
		steps(0);
		steps(5);
		steps(-3);
		steps(-1);
		steps(0);
		
		 /*
		  *  create a method  getLarger that accepts 3 numbers and prints larger one
		  *  if they are equal it prints "Numbers are equal : number"
		  * 
		  */

	}
	 public static void getLarger( int num1 , int num2) {
		
		 if(num1>num2) {
			 System.out.println(num1);
		 }else if(num2>num1) {
			 System.out.println(num2);
		 }else {
			 System.out.println("Numbers are equal:" +num1);
		 }
		 
	 }
	 
	 /*
	  * 
	  * create a method getMax -that accepts an int array 
	  * and prints largest number in the array
	  *  If array is empty , print "ERROR: Array is empty"
	  */
	  
	 
	 public static void getMax(int [] nums) { //it is call a method signature
		 if (nums.length==0) {
			 System.out.println("ERROR : Array is empty");
			 return;
			 
			 
		 }
		 Arrays.sort(nums);
		 System.out.println(nums[nums.length-1]);
	 }
	 /*
	  *  create a method steps . it accepts an int parameter.
	  *  if the parameter is negative then we print "jump" that many times-2
	  *  Jump 1
	  *  jump2
	  *  
	  *  if parameter is 0 then we sit 
	  *  if it is positive we take steps 
	  *  Step 1
	  *  Step2
	  *  
	  *  
	  */
	 
	 public static void steps(int times) {
		 if(times==0) {
			 System.out.println("Sit");
		 }else if(times >0) {
			 for(int i=0; i<=times; i++) {
				 System.out.println("Step" + i);
				 
			 }
		 }else if(times <0) {
			 for(int n=1; n<=times * (-1); n++) {
				 System.out.println(" Jump" + n);
			 }
		 }
		 
		 
	 }

}
