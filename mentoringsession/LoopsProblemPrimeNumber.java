package mentoringsession;

import java.util.Scanner;

public class LoopsProblemPrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		boolean isPrime=true;
		int number=scan.nextInt();
		for(int i=2;i <number; i++) {
			if(number% i==0) {
				isPrime=false;
				System.out.println("It is not Prime Number");
				break;
			}
		

	}
	
		if(isPrime) {
			System.out.println(" It is a prime number");
		}
		scan.close();
		
		
		Scanner input = new Scanner(System.in);
		int remainder ;
		int reverseNumber = 0;
		int temp;
		int num=input.nextInt();
		temp=num;
		while(num !=0) {
			remainder=num %10;
			reverseNumber=(reverseNumber*10)+remainder;
			num=num /10;
		}
		if(temp==reverseNumber) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println(" Not  Palindrome Number");
		}
		
		input.close();
		
		

}
}
