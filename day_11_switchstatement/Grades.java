package day_11_switchstatement;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Grade");
		char grade=scan.next().charAt(0);
		switch (grade) {
		case 'A':
			System.out.println("excellent");
			break;
		case 'B':
			System.out.println("good");
			break;
		case 'C':
			System.out.println("acceptable");
			break;
		case 'D':
			System.out.println("poor");
			break;
			default:
				System.out.println("eeror:invalid grade");
		}
		
	}

}
