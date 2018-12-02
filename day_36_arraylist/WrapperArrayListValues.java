package day_36_arraylist;

import java.util.ArrayList;

public class WrapperArrayListValues {

	public static void main(String[] args) {
		 ArrayList<Integer> nums= new ArrayList<>();
		 nums.add(300);
		 nums.add(500);
		 nums.add(1234);
		 nums.add(654);
		 System.out.println(nums);
		  //for Each Loop
		 
		 for( Integer num :nums) {
			 System.out.println(num);
		 }
		 
		 System.out.println("====================");
		 for(int num:nums) {
			 System.out.println(num);
		 }
		 System.out.println("====================");
		 
		 //print each value using for Loop
		 
		 for(int i=0; i<nums.size(); i++) {
			 System.out.println(nums.get(i));
			
		 }
		
		 
		 

	}

}
