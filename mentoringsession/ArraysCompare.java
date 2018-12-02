package mentoringsession;

public class ArraysCompare {

	public static void main(String[] args) {
		/*
		 * Given 2 arrays ensure than all items in first array are present in second one 
		 * {"apples","bananas","carrots"}
		 * {"bananas","strawberries","apples", "kiwis"}
		 * 
		 * 
		 */
		
		
		String[] box1= {"apples","bananas","carrots", };
		String[] box2= {"bananas", "strawberries",  " kiwis", "carrots"};
		  
		SEARCH:
	    for(String fruit1:box1 ) {
	    	boolean found=false;
	    	for(String fruit2: box2) {
	    		if(fruit1.equals(fruit2)) {
	    			found=true;
	    			break SEARCH;
	    			//System.out.println();
	    		}
	    	}
	    	if(found) {
	    		System.out.println(fruit1 + " is in box2");	
	    	}else {
	    		System.out.println(fruit1+" is not in box2");
	    	}
	    }
		
	}
	

}
