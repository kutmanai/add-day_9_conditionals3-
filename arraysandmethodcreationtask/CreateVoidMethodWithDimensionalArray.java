package arraysandmethodcreationtask;

import java.util.Arrays;

public class CreateVoidMethodWithDimensionalArray {
  //1 Create void method that accepts two dimensional int array and prints
	//out the Biggest integer element.
	
	public static void main(String[] args) {
		
		int [][] data ={{4,2,6,45,23,1},{22,34,66},{1,2,3}};
		  // (getMaxValue(data));
		getMaxValue(data) ;
		
	}
	public static  void  getMaxValue (int[][] data) {
		int maxValue=1;
		for( int i=0; i<data.length; i++  ) {
			for( int j=0; j<data.length; j++) {
				if(data[i][j]>maxValue) {
					maxValue=data[i][j];
					
				}
			}
			
		}
		System.out.println(maxValue);
		
	}
}
