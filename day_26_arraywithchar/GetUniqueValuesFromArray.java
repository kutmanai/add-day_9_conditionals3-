package day_26_arraywithchar;

public class GetUniqueValuesFromArray {

	public static void main(String[] args) {
		 int[] nums= { 1,2,1,3,4,2,3,4,44,12,20,100,33,100,4};
		 /*  take a number from array
		  * compare with the rest of numbers in the array. if no matches found 
		  * it is unique and print it out
		  * 
		  * take  a number from array
		  * create a variable counter and assign 0 to it. int counter=0;
		  * compare the number with all other numbers (dont compare the number with itself)
		  * if a match found counter++ if not dont touch counter
		  * check if counter is still 0 , if yes , print that number because it is unique
		  * 
		  * 
		  * 
		  */

		 
		   for( int outer=0; outer<nums.length; outer++) {
			   int currentNum=nums[outer];
			   boolean unique=true;
			   
			   for(int inner=0;inner<nums.length; inner++) {
				   if(nums[inner]==currentNum && outer !=inner) {
					   unique=false;
					   break;
				   }
			   }
			   
			   if(unique) {
				   System.out.print(currentNum + " ");
			   }
			   //System.out.print(nums[outer] + " ");
//			   for( int inner=0; inner<nums.length; inner++) {
//				  // boolean duplicate=false;
//				   if(nums[outer]==nums[inner]) {
//					   duplicate=true;
//					   
//					   
//				   }
//				   
//			   }
//			   if(duplicate==false) {
//				   System.out.print(nums[outer] + " ");
//			   }
		   }
		
		

	}

}
