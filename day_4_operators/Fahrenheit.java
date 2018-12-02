package day_4_operators;

 import java.util.Scanner;
 
public class Fahrenheit {

	public static void main(String[] args) {
		Scanner scan =new  Scanner (System.in);
		System.out.println("Enter a value Fahrenheit");
		double fahrenheit =scan.nextDouble();
		double celcius =(5.0 /9) * (fahrenheit -32);
		
		System.out.println("Tempereture is Celcius " +celcius);
		
		
		// TODO Auto-generated method stub

	}

}

