package day_8_conditionals2;

public class Grades {

	public static void main(String[] args) {
	char grade ='D';

	if (grade =='A') {
		System.out.println("Excellent ");
	} else if (grade=='B') {
		
		System.out.println("Good");
		System.out.println("Good job");
	} else if (grade =='C') {
		System.out.println("Acceptable");
	} else if (grade =='D') {
		System.out.println("Fail");
		System.out.println("Work harder");
	} else {
		System.out.println("Invalid Grade.Only A,B,C,D allowed");
	}
		
	}

}
