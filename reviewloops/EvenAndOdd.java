package reviewloops;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		/*
		 * 
		 * Accepts 2 numbers from users:
		 * if number1 is less then number2-loop for
		 * forward
		 * if number1 is greater than number2-loop backwards  in that range
		 * 3
		 * 6
		 * 3
		 * !) just print numbers
		 * 2) print odd and even numbers
		 * 
		 * 
		 */
		
		   Scanner scan =new Scanner (System.in);
		   System.out.println(" Please enter the numbers");
		   int n1, n2;
		   
		   n1=scan.nextInt();
		   n2=scan.nextInt();
		   if (n1<n2) {
			   for(int i=n1;i<=n2; i++) {
				   System.out.print(i + " ");
				   
				   
			   }
			   
		   }else if(n1>n2) {
			   for(int i=n1;i>=n2; i--) {
				   System.out.println(i + " ");
			   }
		   }else {
			   System.out.println(n1);
		   }
		   
		   

	}

}
