package day_9_conditionals3;

public class ShippingCalculator {

	public static void main(String[] args) {
		/*price, distance , speed
		 * regular shipping rates:
		 *  1-100$          17
		 *  
		 *  101-300          10
		 *  300 +             free
		 *  if price between 1 $ -100 $  spend
		 *  price distance cost
		 *  
		 *  
		 *  express shipping rates :
		 *  price distance cost
		 *  1-100$          35
		 *  
		 *  101-300          25
		 *  300 +            15
		 */
		
		  int  shippingMode =1;
		   // 1-regular , 2-=express
		  double purchasePrice = 1500.0;
		  double shippingCost =0.0;
		  
		  if (shippingMode == 1)  {
			  
			  System.out.println(" REGULAR SHIPPING SELECTED ");
			  if(purchasePrice >=1.0 && purchasePrice <=100) {
				  shippingCost =17.0;
			  }
		  }
		  
		  
				  
				  
		   else if (purchasePrice >=101.0 && purchasePrice <=300.0) {
			  shippingCost = 10.0;
			  
			  
		  } else if (purchasePrice >300.0) {
			  shippingCost = 0.0;
			   
		  } else if (shippingMode ==2) {
			  
			  System.out.println(" EXPRESS SPIPPING SELECTED "); 
			  if (purchasePrice >=1.0 && purchasePrice <=100.0) {
				  shippingCost =35.0;
				  
			  }else if (purchasePrice >=100.0 && purchasePrice <=300.0) { 
				  shippingCost = 25.0;
			  }
		  } else if (purchasePrice > 300.0) {
			  shippingCost = 15.0;
		  }
		  System.out.println(" Total shipping cost : " + shippingCost);
		  
		  
		  
}
		

	}
	


