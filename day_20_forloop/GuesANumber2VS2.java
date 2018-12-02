package day_20_forloop;

import java.util.Random;
import java.util.Scanner;

public class GuesANumber2VS2 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    Random random=new Random();
		   System.out.println(random.nextInt());//give me random number betweenm 0and 9
		  // System.out.println(random.nextDouble());
		   int secretNumber=random.nextInt(100);
		    int guessedNumber;
		   do {
			    System.out.println("Guess the number");
			    guessedNumber=scan.nextInt();
			    
			    if(guessedNumber==secretNumber) {
			    	System.out.println("Congratulations you won");
			    }else if (guessedNumber>secretNumber){
			    	System.out.println("Too Large");
			    }else {
			    	System.out.println("Too small");
			    }
		   }while(secretNumber !=guessedNumber);
		  
		    

	}

}
