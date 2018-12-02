package day_4_operators;
 import java.util.Scanner;
 
public class AgeCalculatorWithString {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter year of birth");
		int yearOfBirth =scan.nextInt();
		
		System.out.println("Enter current year :");
		
		int currentYear = scan.nextInt();
		int age = currentYear -yearOfBirth;
		
		System.out.println(" If you are born on " +yearOfBirth + " and current year is " +currentYear + " then you are " +age + " years old.");
		
		
		
		
	

	}

}
