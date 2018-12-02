package mondaygroupproject_4;

public class Task5and6 {

	public static void main(String[] args) {
		
           /* Task 5
            * Print  numbers between 1 and 20 in a way that:
            *  a. numbers are printed with plus signs between them and a space on either side.
            *  b. there should be no plus signs or space before the first number and after the last.
            *  
            * 
            */
		  for (int i=1; i <=20; i++) {
			  String plus ="+";
			  System.out.print(i);
			  if (i==20) {
				  break;
			  }
			  System.out.print(plus);
			  
			  /*
			   * Task 6
			   * Write for and while loops that they add numbers between 1 and 20 and display the sum
			   * 
			   */
			  
			      int sum =0;
			      int j =1;
			      while(j<=20) {
		    	  sum =sum+j;
			    	  j++;
			    	  System.out.println(sum);
			    	  break;
			    	  
			      }
			      
			      int sum1=0;
			      for(int s =1; s<=20; s++) {
			    	  sum1=sum1+s;
			    	  System.out.println(sum1);
			      
		  }
	         
		

	}

}
}
