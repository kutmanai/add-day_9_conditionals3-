package day_4_operators;

import java.util.Scanner;

public class OfficeHoursTernaryOperators {

	public static void main(String[] args) {
		
         Scanner scan =new Scanner(System.in);
         System.out.println(" Enter first number");
        	 int  first=scan.nextInt();
        	 System.out.println(" Enter second number"); 
            int second=scan.nextInt();
            System.out.println(" Enter third number");
            int third=scan.nextInt();
          if(first==second && second==third) {
        	  System.out.println(0);
          }else if (first==second) {
    
        	 System.out.println(third);
	} else if (first==third) {
		System.out.print(second);
	}
     System.out.println(third);
}
}
