package mondaygroupproject_4;

import java.util.Scanner;

public class Part2Task2 {

	public static void main(String[] args) {
		
		
Scanner input = new Scanner (System.in);
        
        int numPos = 0, numZer=0, numNeg=0;
        for(char answer ='y'; answer=='y';) {

            System.out.println("enter the number: ");
            int num=input.nextInt();
            if(num>0) {
                numPos++;
            }else if (num==0) {
                numZer++;
            }else if (num<0) {
                numNeg++;
            }
            System.out.println("Do you want to continue y/n?");
            answer =input.next().charAt(0);
                if(answer !='y' && answer !='n') {
                System.out.println("Invalid entry");
            }
        }
        System.out.println("Positive numbers:" +numPos );
        System.out.println("Negative numbers: " +numNeg);        
        System.out.println("Zero numbers: " +numZer);

	}

}
