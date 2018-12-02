package mentoringsession;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		/*
		 * 
		 * Given a number print multiplication table for that number
		 * ex:
		 * 2 x1=2
		 * 2 x2=4
		 * 2 x3=6
		 * 
		 * 
		 * 
		 */
		
//		//Scanner scan = new Scanner (System.in);
//		//System.out.println(" Please enter a numbers");
//		int number =3;
//		//3 then 4 then 5;
//		 for (int num=3; num<=5; num++) {
//			 //nested for loop
//		for(int i =0; i<12;i ++) {
//			System.out.println(num + "x" + (i+1)+ "=" + (num * (i+1)));
//		}
//		
//		System.out.println("==============");
//		
//		
		
		
		 //}
		 // i would like to see only for 3 and 5 and 7;
		 for (int num=1; num<=10; num++) {
			 if(num !=3 && num !=5 && num !=7) {
					continue;
				}
			 //nested for loop
		for(int i =1; i<=12;i++) {
			System.out.println(num + "x" + i+ "=" + (num *i));
		}
		
		System.out.println("==============");
		
		

	}

}
}

