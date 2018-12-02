package day_31_method02;

public class ArrayMultiDimensionalWithMethod {

	public static void main(String[] args) {
		 int [] [] numbers= { {1,2,3,4},
	 			  {5,6,7,8},
	 			  {4,3,2,1},
	              {4,3,9,10}};
		 
		 getCoord(numbers,2,3);

	}
	
	public static void getCoord(int [][] givenArray, int rows , int col) {
		
		
		
System.out.println("The element at the row number:" + rows + "column number:" + col + "number itself: " +givenArray[rows][col]);
	}

}
