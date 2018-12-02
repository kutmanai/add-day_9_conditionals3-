package repeattask;

import java.util.Scanner;

public class FindLargerNumber {

	public static void main(String[] args) {
		
		  System.out.println(" I FIND LARGER NUMBER  ");
		  
		  Scanner scan =new Scanner (System.in);
		   int num1,num2, num3,max;
		   System.out.println(" Enter 2 numbers ");
		   num1=scan.nextInt();
		   num2=scan.nextInt();
		   
		   if (num1 >num2) {
			   max =num2;
			   
			   
		   } else  if  ( num2>num1 ){
			   max =num2;
			   
		   } else {
			   max =num1;
			   
		   }
		  
		  System.out.println(" Max number : " + max);
		 

	 if ( num1 > num2) {
		max =num1;
		
	} else {
		max =num2;
	}
	 System.out.println("  I FIND LARGEST NUMBER ");
	 System.out.println(" Enter 3 numbers :");

	 num1= scan.nextInt();
	 num2=scan.nextInt();
	 num3=scan.nextInt();
	 
	 if (num1>= num2 && num1>=num3) {
		 max =num1;
		 
		 
	 } else if ( num2>num1 && num2 >num3) {
		 max =num2;
	 }else {
		 max=num3;
	 }
	 System.out.println(" Max: " +max);
}
}

