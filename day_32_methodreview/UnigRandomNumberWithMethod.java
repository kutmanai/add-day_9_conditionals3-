package day_32_methodreview;

import java.util.Arrays;
import java.util.Random;


public class UnigRandomNumberWithMethod {

	public static void main(String[] args) {
		 int [] arr=unigRandomNumbers(4,15);
		System.out.println(Arrays.toString(arr));
		
      //1.Create method that generates unique random numbers and returns in integer arrayInput: 
		//2 parameters -> 1- integer for size, 2- integer for boundOutput: integer array
		/*
		 * Flow
		 * 1. Generate random number
		 * 2.check if the specific random number already inside our array ->
		 * if already exists then go back to top and regenerate integer again
		 * --> if it does not exist then add the value to our array.
		 */

	}
	/**
	 * 
	 * @param size
	 * @param bound
	 * @return
	 */
	public static  int [] unigRandomNumbers( int size , int bound){
		int [] result=new int[size];
		Random random=new Random();
		boolean check=true;
		int index=0;
		while(check) {
			int ranNum=random.nextInt(bound);
			if(!checkNumberinArray(result,ranNum)) {
				result[index]=ranNum;
				index ++;
			}
			if(index==size) {
				check=false;
			}
					
			
		}
		return result;
		 
		
	
		
	}
	public static boolean checkNumberinArray(int [] arr,int target) {
		for( int i:arr) {
			if(i==target) {
				return true;
			}
		}
		return false;
		
	}
	

}
