package mondaygroupproject_4;

import java.util.Scanner;

public class LevelEasy4PrimeNumber {

	public static void main(String[] args) {
//		Level: easy
//		Write a Java program which accepts a number from user and check if the number is prime or
//		not?
//		A prime number is a number is divisible by itself and 1 only.
//		Input:
//		7
//		Output:
//		True
//		Input:
//		10
//		Output:
//		False
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a numbers");
		int num =scan.nextInt();
		int i=1;
		boolean flag =false;
		while(i <=num/2) {
			// condition for nonprime number
			if (num %i==0) {
			flag=true;
			break;
			
		}
		
		++i;
		}
		
		if(!flag)
			System.out.println(num + " is a prime number");
		else
		    System.out.println(num + " is not a prime number ");
		
		
             
		
		 

	}

}
