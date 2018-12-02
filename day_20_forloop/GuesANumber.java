package day_20_forloop;

import java.util.Random;
import java.util.Scanner;

public class GuesANumber {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    Random random=new Random();
		   System.out.println(random.nextInt());//give me random number betweenm 0and 9
		  // System.out.println(random.nextDouble());
		   int secretNumber=random.nextInt(10);
		    int guessedNumber;
		   do {
			    System.out.println("Guess the number");
			    guessedNumber=scan.nextInt();
			    
			    if(guessedNumber==secretNumber) {
			    	System.out.println("Congratulations you won");
			    }else {
			    	System.out.println("Incorrect guess. Try again");
			    }
		   }while(secretNumber !=guessedNumber);
		  // System.out.println("Num value -" +num);
		    

	}

}
