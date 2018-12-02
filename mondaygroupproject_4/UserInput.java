package mondaygroupproject_4;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean b=true;
		Scanner input=new Scanner (System.in);
		String userInput="";
		int userNumber=0;
		int currentHighestNumber =0;
		do {
			System.out.println("Enter a number :");
			userNumber=input.nextInt();
			System.out.println("Do you want to enter more numbers?");
			userInput=input.next();
			if(userInput.equalsIgnoreCase("no")) {
				b=false;
				
			}
			if (userNumber>currentHighestNumber) { // if user entry is higer > true
				currentHighestNumber=userNumber;
			}
		}while(b);
		System.out.println("current highest  number =" + currentHighestNumber);
	}

}
