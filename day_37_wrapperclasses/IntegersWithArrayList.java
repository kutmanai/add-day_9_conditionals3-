package day_37_wrapperclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegersWithArrayList {

	public static void main(String[] args) {
		 //1.Create list of intgers 
		//2 Ask from the user and store int type using
		//Scanner then add each number if it even number
		  
		 List<Integer> nums = new ArrayList<>();
		 
		 Scanner scan= new Scanner(System.in);
		 
		
		 
		 for( int i =0; i<5; i++) {
			 System.out.println(" Please enter numbers");
			 int number=scan.nextInt();
			 if(number %2==0) {
				 nums.add(number);
				 
			 }
			 
		 }
		 System.out.println(nums);
		 
		 
	}

}
