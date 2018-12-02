package day_28_arraysclass_multiDimensiions;

public class CountEvents {

	public static void main(String[] args) {
		//Count even numbers in the array
		int[] nums= {2,1,2,3,4};
		int counter=0;
		
		for( int n :nums) {
			if(n %2==0) {
				counter++;
				
			}
		}
		System.out.println(counter);

	}

}
