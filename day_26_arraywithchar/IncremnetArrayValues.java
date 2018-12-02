package day_26_arraywithchar;

public class IncremnetArrayValues {

	public static void main(String[] args) {
		
   int[] nums= {1,2,3,4,5,6,7,8,9};
   for(int n :nums) {
	   System.out.print(n + " ");
   }
   
   System.out.println();
   
    //3. Using a loop write some code to do the following:
  // if the value is even - double it and assign back.
   // if the value is odd - triple it and assign back.
   
    
         for(int i=0;  i<nums.length; i ++) {
        	// System.out.println(nums[i]);
        	 
        	 if(nums[i] %2==0) {
        		 nums[i]=nums[i] *2;
        	 }else {
        		 nums[i]=nums[i]*3;
        		 
        	 }
        	 // nums[i]=(nums[i] %2==0) ? nums[i] *2 : nums[i] * 3; ternary way
         }
         for(int n :nums) {
        	 System.out.print(n + " ");
         }
         System.out.println();

	}

}
