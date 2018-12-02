package mondaygroupproject_4;

import java.util.Scanner;

public class CoddingTask6LevelEasyNumberOfMounth {

	public static void main(String[] args) {
		

//		Level: very easy
//		Write a Java program which repeatedly ask the user to enter the number of the months (1 to 12).
//		If the user enters an incorrect number, Program terminates.
//		For Example:
//		Input:
//		Enter number of a month: 1
//		Enter number of a month: 5
//		Enter number of a month: 12
//		Enter number of a month: 13
		
		 Scanner scan =new Scanner(System.in);
		 
		 int month;
		 
		 do {
			 System.out.println("Please  enter number of  month:");
			 month=scan.nextInt();
			 if(month >0 && month <13) {
				 System.out.println("Number of month " +month);
			 }else {
				 System.out.println("incorrect enter");
			 }
		 }while (month >0);
    	 
	
		
		
	}
	
	          

}
