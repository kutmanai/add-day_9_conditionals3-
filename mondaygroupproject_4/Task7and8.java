package mondaygroupproject_4;



public class Task7and8 {

	public static void main(String[] args) {
		/* Write for and while loops so that they add up the even numbers between 
		 * 1 and 20 and prints it
		 * 
		 *  Expected Output: 110
		 *   Task7 
		 */ 
		   
	 
      int num=0;
	  int i=2;
	  while(i<=20) {
	  num=num+i;
		  i=i+2;
		  
	  }
	  System.out.println(num);
	  
	  
	   
	   int num1=0;
	   for(int j=2; j <=20; j=j +2) {
		   num1=num1 +j;
	   }
	   System.out.println(num1);
	    System.out.println();
	   /* Task 8
	    *  Write for and while loops so that they go through the odd integers (from 1 to 19)
	    *  keeping track of the sum of these integers at each stage , and printing the sum at each stage
	    *  Expected Output:149162536496481100
	    *  
	    *  
	    * 
	    */
	    int num2=0;
	    int k=1;
	    while(k<=19) {
	    	num2=num2 +k;
	    	System.out.print(num2 + " ");
	    	k =k +2;
	    	
	    }
	    System.out.println();
	    
	     int num3=0;
	     for(int l =1; l<=20; l++) {
	    	 if (l%2==1) {
	    		 num3=num3 +l;
	    		 System.out.print(num3 + " ");
	    		 
	    	 }
	    	 
	     }
	    
	    
	   
	   
	   
	   
	   
		
	}

}
