package mentoringsession;

public class CoinJar {

	public static void main(String[] args) {
		
  
		/*
		 *  Create an array of ints call CoinsJar
		 *  Assign dimes, quarters and nickels
		 *  Loop through each item in array using for each loop
		 *  and count how many dimes, quarters and nickels you have
		 *  and how much worth
		 *  
		 * 
		 * output
		 * you have 4 quarters ->100 cents
		 * you have 3 dimes 30 cents
		 * you have 5 nickels 25 cents
		 * 
		 */

		
		  int[]CoinJar= {10,10,25,25,5,5,5,25,10};
		  int quarters, dimes,nickels;
		  quarters=dimes=nickels=0;
		  for(int coin: CoinJar) {
			  switch(coin) {
			  case 25:
				  quarters++;
				  break;
			  case 10:
				  dimes++;
				  break;
			  case 5:
				  nickels++;
				  break;
				  default:
					  System.out.println("Not a quarters or dime or nickel");
					  break;
			  }
		  }
		  
		  System.out.println("You have" +  quarters+ "quarters " + (quarters *25) +"cents");
		  System.out.println("You have" +  dimes+ "dimes " + (dimes *10) +"cents");
		  System.out.println("You have" +  nickels + " nickels" + (nickels *5) +"cents");
			 
			 	 
		  
	}

}
