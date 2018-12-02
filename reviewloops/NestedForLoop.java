package reviewloops;

public class NestedForLoop {

	public static void main(String[] args) {
		  int rowCount=5;
		  int colCount=4;
	//task : do what is below with different number and try to understand
		  // why  we did what we did by
		  for(int i =1; i<rowCount; i++) {
			  System.out.println(" ------ at row number " + i);
		  
		
       for(int j=1; j<colCount; j++) {
    	   System.out.print(" at col number");
    	   
    	   System.out.print( " **Cell(" + i+ "," + j+ ")");
       }
		  }
       System.out.println();
		
       
       
	}

}
