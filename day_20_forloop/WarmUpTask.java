package day_20_forloop;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int start=scan.nextInt();
		 int end=scan.nextInt();
		if(start<end) {
			System.out.println("LOOPING FORWARDED");
			while(start<=end) {
				System.out.println("Step" +start);
				start++;
				
			}
		}else if(start>end) {
			System.out.println("Looping Backwards");
			while(start>=end) {
				System.out.println("Step" +start);
				start--;
			}
		}else {
			System.out.println("Start and are equal");
			System.out.println("Step "+start);
		}
		
	}

}
