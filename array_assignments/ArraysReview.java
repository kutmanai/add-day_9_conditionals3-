package array_assignments;

import java.util.Arrays;

public class ArraysReview {

	public static void main(String[] args) {
//		  int[] numbers= {2,5,7};
//	 	  System.out.println(numbers[0]);
//	 	  int []numbers= new int[3];
//   numbers[0]=10;
//   numbers[1]=5;
//   numbers[2]=50;
//		
//       System.out.println(numbers[0]-1);
//       System.out.println(numbers.length);
//		
//		int[] numbers=  new int[3];
//		
//		 numbers[0]=10;
//	     numbers[1]=5;
//	     numbers[2]=50;
//	      //copying elements from on array to another array with changing size
//	     
//	     int[] copiedNumbers=new int[numbers.length+1];
//	     for(int i=0; i<numbers.length; i++) {
//	    	 copiedNumbers[i]=numbers[i];
//	    	 //copiedNumbers-{10,5,50,0}
//	    	 
//	    	 
//	     }
//	     
//	     copiedNumbers[3]=9;
//	    // copiedNumbers={10,5,50,9}
//	      for( int number:copiedNumbers) {
//	    	  System.out.println(number);
//	      }
//	      System.out.println(Arrays.toString(copiedNumbers));
//       
//		 int[] numbers= { 1,2,3,4,5,6,7,8,9,10};
//		 String[] words= new String[] {"I","HELLO","love","world","Java"};
//		 System.out.println(words[0] +" " + words[2] +" " +words[4]);
//		 
//		 // sum of the array
//		 int [] nums=new int [] {2,5,9,12,4,1};
//		 int sum=0;
//		 for(int i=0; i<nums.length; i ++) {
//			 sum=sum +nums[i];
//		 }
//		 System.out.println(sum);
		
		
//		 int[] numbers= {1,3,5,6,7}; //7,6,5,3,1
//		 for(int i=numbers.length-1; i>0; i--) {
//			 System.out.print(numbers[i] + " ");
		
//		
       String[] fruits={"watermelon","apple","watermelon","peach","mango" ,"watermelon"};
		//int watermelon=0;
		int watermelonCounter=0;
//		for(int i=0; i <fruits.length; i++) {
//			if(fruits[i].contains("watermelon")) {
//				 watermelonCounter++;
//			}
//		}
//		System.out.println(watermelonCounter);
       
		int i=0;
		while(i<fruits.length) {
			if(fruits[i].contains("watermelon")) {
				watermelonCounter++;
			}
			i++;
		}
		System.out.println(watermelonCounter);
		
	}

}
