package day_31_method02;

public class ArraysMultiDimensionalExample {

	public static void main(String[] args) {
		 int [] [] numbers= { {1,2,3,4},
				 			  {5,6,7,8},
				 			  {4,3,2,1},
				              {4,3,9,10}};
		    for(int row=0; row<numbers.length; row++) {
		    	for(int col=0; col<numbers[row].length; col++) {
		    		System.out.print(numbers[row][col] +"\t");
		    		
		    	}
		    	System.out.println();
		    }
		    
		    
		 
		

	}

}
