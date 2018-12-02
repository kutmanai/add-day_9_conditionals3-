package day_7_conditionalstatments;
 import java.util.Scanner;
 
public class WarmUpTask {

	public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);
		 System.out.println("USD amount");
		  double $ =input.nextDouble();
		  double euros =  $ * 0.86; 
		  double eur2usd = 1.1633399;
		  
		  System.out.println(" USD = " + $ +" EUR " +euros );
		  double usdfromEuros =$ * eur2usd;
		  System.out.println("EUR =" +$ +eur2usd + " USD ");
		  
		  
		  
		  
		  
		  
		  
		  
		 
		  
	}

}
