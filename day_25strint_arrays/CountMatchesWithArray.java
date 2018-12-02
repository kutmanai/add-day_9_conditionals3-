package day_25strint_arrays;

public class CountMatchesWithArray {

	public static void main(String[] args) {
		
           /* 
            * create a double array code called prices
            * assign 10 or more different prices
            * using a loop count how many items that is more than 20$
            * print the count
            * 
            *  if no price was found that is more 20$
            *  than print no items that costs less than $20
            * 
            */
		
		   
		 double[]prices= {3.43,3,12,4,19.99,10,2.30 };
		 int count=0;
	
		  for ( double price:prices) {
			  if(price>20.0) {
				  count++;		  
			  }
			
		  }  
		  if(count==0) {
			  System.out.println("No items for more than $20");
		  }else {
		  System.out.println(count + "items with more than $20");
		 
		  }
		
		
	}

}
