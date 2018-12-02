package day_25strint_arrays;

public class SearchInArray {

	public static void main(String[] args) {
		
   // create array nums and assign 10 different numbers to it
		/*
		 * 
		 * search  for a number 100 in it using a loop, once found print the index
		 * location and "value found at index"+ index
		 *  if that search value is not found "100 not founded in the array
		 *  once you find 100 then exit the loop at that point we are looking for
		 *  only first 100, not all of them.
		 *  
		 */
		
		    int[] number = {1,2,3,4,51001,6,9,1001,890,456};
		    int lookfor=100;
		    boolean found=false;
		    
		    for( int  i=0; i<number.length; i++) {
		    	if(number[i]==lookfor) {
		    		System.out.println( lookfor+" was found at index" +i);
		    		found=true;
		    		break;
		    	}
		    	}
		    	
		    
		     if(found==false) {
		    	 System.out.println(lookfor+ " not found");
		      
		
		
	}

}
}
