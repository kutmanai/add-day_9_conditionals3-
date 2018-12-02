package day_26_arraywithchar;

public class RepeatingTaskArray {

	public static void main(String[] args) {
		
		//1) Write a program called IncrementArrayValues:
			//
//						1. Declare array nums and assign {1,2,3,4,5,6,7,8,9}
			//
//						2. Print out all values in single line separated by space:
			//
//						1 2 3 4 5 6 7 8 9
			//
//						3. Using a Loop write some code to do the following:
			//
//						       if the value is even - double it and assign back. If the value is odd - triple it and assign back.
			//
//						4. Print out all values in single line separated by space:
			//
//						3 4 9 8 15 12 21 16 27

		
		
		    int[] nums= {1,2,3,4,5,6,7,8,9};
		    for( int num:nums) {
		    	System.out.print(num + " ");
		    	
		    	
		    }
		    
		     System.out.println();
		      for( int i =0; i<nums.length; i ++){ 
		    	  if(nums[i] % 2==0 ) {
		    		  nums[i]=nums[i] *2;
		    	  }else {
		    		  nums[i]=nums[i] *3;
		    	  }
		      
		    
		      }
		      for(int n:nums) {
		    	  System.out.print( n + " ");
		      }
		
	}

}
