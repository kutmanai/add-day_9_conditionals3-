package mentoringsession;

import java.util.Scanner;

public class CountPossitiveNegative {

	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		 int number =1;
		 int posCounter=0;
		 int negCounter=0;
int total=0;
int counter=0;
		  do {
			  //statement
			  System.out.println("\nEnter an integer please:");
			   number=scan.nextInt();
			   total=total+number;
			   if(number>0) {
				   posCounter++;
			   }else if(negCounter<0) {
				   negCounter++;
			   }
			  
		  }while(number !=0);
		  
		  System.out.println("You have entered" +posCounter + "positive numbers");
		  System.out.println("You entered" + negCounter + "negetive numbers");
		  System.out.println("The total of numbers you entered is"+total);
		  System.out.println(" The average of number you have entered is" +( (1.0 *total)/counter));
		  
	}

}
