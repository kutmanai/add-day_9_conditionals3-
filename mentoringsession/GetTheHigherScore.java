package mentoringsession;

import java.util.Scanner;

public class GetTheHigherScore {

	public static void main(String[] args) {
		
		 //  3- write a program that promts the user to enter
		// the number of students and each students and each students name and score,
		//and finaly display the name of the students with the higesht score
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter  the number of students:");
		
		int numberOfStudents=scan.nextInt();
		String name="";
		int score=0;
		int max=Integer.MIN_VALUE;
		String maxName=name;
		for( int i=1; i<=numberOfStudents; i++) {
			System.out.println("Please enter the " + i + "Students name:");
			name=scan.next();
			System.out.println("Please enter" + name + " score");
			score=scan.nextInt();
			//compare the max with the new score , and if it is greater than than assign in than max
			if(max>score) {
				max=score;
			}else {
				max=max;
				//who has the highest score?
				System.out.println(maxName + " has the higest score and it is" +max);
			}
			
		}
		

	}

}
