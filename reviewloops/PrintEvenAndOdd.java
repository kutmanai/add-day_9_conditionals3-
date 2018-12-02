package reviewloops;

import java.util.Scanner;

public class PrintEvenAndOdd {

	public static void main(String[] args) {
		

		Scanner scan =new Scanner (System.in);
		   System.out.println(" Please enter the numbers");
		   int n1, n2;
		   String mode;
		   
		   n1=scan.nextInt();
		   n2=scan.nextInt();
		   System.out.println("Even or Odd mode:");
		   mode=scan.next();
		   if (n1<n2) {
			   for(int i=n1;i<=n2; i++) {
				   //mode check
				   if(mode.equals("Even") && i %2==0) {
					   
						   System.out.print(i + " ");   
					   
				   }else if (mode.equals("Odd") && i %2 !=0) {
					   System.out.println(i + " ");
				   }
				   
				   
			   }
			   
		   }else if(n1>n2) {
			   //mode check
			   for(int i=n1;i>=n2; i--) {
				   if(mode.equals("Even") && i %2==0) {
					   System.out.println(i + " "); 
				   }else if (mode.equals("Odd") && i % 2 !=0) {
					   System.out.println( i + " ");
				   }
				   
			   }
				   
			   
		   }else {
			   System.out.println(n1);
		   }
		   
		
	}

}
