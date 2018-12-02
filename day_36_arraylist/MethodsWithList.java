package day_36_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MethodsWithList {

	public static void main(String[] args) {
		ArrayList<Integer>nums= new ArrayList<>();
		nums.add(1000);
		nums.add(4000);
		nums.add(10000);
		
		int result=sumList(nums);
		System.out.println(result);
		System.out.println(sumList(nums));
		List<Integer>myNums1= new ArrayList<>();
		myNums1.add(100);
		myNums1.add(400);
		myNums1.add(1000);
		
		List<Integer> myNums2= new ArrayList<>(myNums1);
		myNums2.add(543);
		myNums2.add(10);
		int result1=sum2List(myNums1,myNums2);
		System.out.println(result1);
		System.out.println(builIntList(500));
		ArrayList<Integer>randomList=builIntList(5000);
		System.out.println(randomList);
		sumList(builIntList(100));
		
		
	}
	/*
	 * How to write method that accepts on ArrayList
	 * calculate sum of values and return
	 * 
	 */
	
	
	public static  int sumList(ArrayList<Integer> nums) {
		int sum =0;
//		for( int n:nums) {
//			sum+=n;
//		}
		
		
		for(int i=0; i<nums.size(); i++) {
		 sum+=nums.get(i);
			
		}
		
		return sum;
		
	}
	
	 /*
	  * 
	  * method: sum2List
	  * Arg:2 Integer arrayList
	  * return type: int 
	  * sum of both  
	  */

	
	  public static int sum2List(List<Integer> nums1, List<Integer> num2) {
		  int sum=0;
		  for(Integer num:nums1) {
			  sum+=num;
		  }
		  for(Integer num:nums1) {
			  sum+=num;
		  }
		  return sum;
	  }
	  
	  /*
	   * How to write a method that returns an arraylist of Integers
	   * method name: buildintlist
	   * return type arraylistof integer
	   * args int 
	   * this method gets an int creates an arraylist with that many random
	   * numbers between 0-100 and returns it
	   */
	  
	  public static ArrayList<Integer> builIntList(int count ){
		  Random random= new Random();
		  ArrayList<Integer> returnList= new ArrayList<>();
		  for(int z=1; z<count; z++) {
			returnList.add(  random.nextInt(101));
			  
		  }
		    return  returnList;
		  
		  
	  }
}
