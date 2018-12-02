package day_31_method02;

public class MultiDimensionalArrayWithMethod2 {

	public static void main(String[] args) {
		
		 int [] [] numbers1= { {1,2,3,4},{5,6,7,8},{10,11,23,45},{8,9,7,5,}};
		 int [][] numbers2={ {1,2,3,4},{5,6,7,8},{10,11,23,45},{8,9,7,5,}};
		 System.out.println("This is the first array given");
		 printArrays(numbers1);
		 System.out.println("This is the second array given");
		 printArrays(numbers2);
	}
	public static void  printArrays(int [] [] givenArray) {
		for(int row=0; row<givenArray.length; row++) {
	    	for(int col=0; col<givenArray[row].length; col++) {
	    		System.out.print(givenArray[row][col] +"\t");
	    		
	    	}
	    	System.out.println();
	}

}
}