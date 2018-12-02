package day_31_method02;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		
		double n1=10;
		double n2=5;
		
		add(n1,n2);
		substract(n1,n2);
		multiply(n1,n2);
		divide(n1,n2);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		n1=scan.nextDouble();
		n2=scan.nextDouble();
		
		System.out.println("Choose operation: \n" + "1-add\n" + " 2-subsract \n" + "3- multiply \n" + " 4- divide");
		/*
		 *  for add select 1
		 *  for substract select 2
		 *  for multiply select 3
		 *  for divide select 4
		 */
		
		//substract();
        /*
         * 
         * Add folowing methods:
         * 
         * 1.add->2 in arguments/parameters/inputs
         * add numbers and prints the result
         * 
         * 2.substract  ->2 double arguments /parametrs /input
         * substruct numbers and prints the results
         * 
         * 3.multiply  -> 2 double arguments /parametrs 
         * multiply
         * 4.divide
         * 
         */
		
		int operation=scan.nextInt();
		switch (operation) {
		case 1:
			add(n1,n2);
			break;
		case 2:
			substract(n1,n2);
			break;
		case 3 :
			multiply(n1,n2);
			break;
		case 4 :
			divide(n1,n2);
			break;
			default:
				System.out.println("Error: Invalid operation");
			
		}
		
		

	}
	public static void add( double num1 ,double num2) {
		double result=num1+num2;
		        
		System.out.println(result);
		
	}
	public static void substract(double num1, double num2) {
		double result=num1-num2;
		System.out.println(result);
		
	}
	public static void multiply(double num1, double num2) {
		double result=num1*num2;
		System.out.println(result);
	
		
	}
	public static void divide(double num1, double num2) {
		if(num2==0) {
			System.out.println(" ERROR:Cannot divide by Zero");
		}else {
			
		
		
		double result=num1/num2;
		System.out.println(result);
		}
	}

}
