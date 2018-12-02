package mondaygroupproject_4;

public class Task3and4 {

	public static void main(String[] args) {
		 /* Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
		  * 
		  * 
		  */
		   for (int k =1; k<20; k++) {
			   if(k%3==0)
				   System.out.print(k + " ");
		   }
		   System.out.println();
		   int j=0;
		   while(j<18) {
			   j+=3;
			   System.out.print( j+ " ");
		   }
		   
		   System.out.println();
		    /* Task 4
		     *  Write for and while loop so that they print the square of each odd number from numbers between 1 and 20;
		     * 
		     * 
		     */
		   
		      
		    for (int l =0; l<=20; l++ ) {
		    	if(l%2==1) {
		    		System.out.print(l * l + " ");
		    	}
		    }
		    System.out.println();
		    int l=1;
		     while(l<=20) {
		    	 System.out.print((l*l) + " ");
		    	 l+=2;
		     }
	}
}
	

