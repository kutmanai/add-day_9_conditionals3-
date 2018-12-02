package day_28_arraysclass_multiDimensiions;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayAssingment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	         boolean check=false;
	        for( int i=0; i<nums.length-1; i++) {
	        	int first=nums[i];
	        	int second=nums[i+1];
	        	
	        	if(first==5 && second==5) {
	        		check=true;
	        		//System.out.println(true);
	        		break;
	        	}
	        }
	        System.out.println(check);
	        
	    

		
	}

}
