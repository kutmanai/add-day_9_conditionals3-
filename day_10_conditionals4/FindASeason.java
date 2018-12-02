package day_10_conditionals4;

import java.util.Scanner;

public class FindASeason {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Find a season ");
		int month=5;
		month=scan.nextInt();
		String season;
		
		if(month==12 && month==1 && month==2) {
			System.out.println("Winter");
		}else if (month>=3 && month<=5) {
			System.out.println("Spring");
		}else if (month>=6 && month<=8) {
			System.out.println(" Summer");
		}else if (month>=9 && month<=11) {
			System.out.println(" Fall");
		}else {
			System.out.println("Invalid month. 1-12 accepted");
		}
		
		
		

	}

}
