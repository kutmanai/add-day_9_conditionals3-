package day_25strint_arrays;

public class SumOfArray {

	public static void main(String[] args) {
		/*
		 * 
		 *  create variable nums -assign several values
		 *  using a loop calculate the sum and print it 
		 *  Additional steps:
		 *  - calculate sum of even numbers
		 *  -calculate sum of odd numbers.
		 *  
		 */
		
		  int[] num= { 20, 35,78, 100,17,11};
		   int sum=0;
		   int sumOfEvens=0;
		   int  sumOfOdd=0;
		   for( int num1:num) {
			   sum +=num1;
			   if(num1%2==0) {
				     sumOfEvens +=num1;
				  
		   }else {
			   sumOfOdd +=num1;
		   }
		   }
		  	   System.out.println(" Value of sum " + sum);
			   System.out.println(" Value of sumOfEvens " +sumOfEvens);
			   System.out.println(" Value of sumOfOdd " + sumOfOdd);

	

}
}