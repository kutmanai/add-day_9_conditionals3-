package day_7_conditionalstatments;

public class IfElseStatement {

	public static void main(String[] args) {
		double coffeePrice=6.00;
		if (coffeePrice <=6.0) {
				System.out.println(" i will get coffee ");
			
		} else {
			System.out.println(" i will not get coffee. Too expensive ");
			
			
		}
		
		double  accountBalance =450.50;
		double price =700;// if you have enough money, you byu the item otherwise/
		//you say not enough balance.
		
		if (accountBalance >=price ) {
			System.out.println("you buy the item  ");
			
		} else {
			System.out.println(" not buy item");
			System.out.println("i am ordering online ");
			System.out.println(" lets wait for pay check ");
		}
		int speedLimit =55;
		int currentSpeed=65;
		
		if (currentSpeed >=speedLimit + 20) {
			System.out.println("you will get a tickets");
			
		} else {
			System.out.println("other wise keep driving");
		}
		// create a boolean variable isPrime
		//if isPrime is true then shipping  is 0.0
		// if not then shipping is 7.99
		//print shipping cost .
		 
		boolean  isPrime=true;
		
		
		if (isPrime ) {
			System.out.println(" shipping price is 0.0 ");
			
		}
		else {
			System.out.println("shipping price is 7.99");
		}
		 
	}
	

}
