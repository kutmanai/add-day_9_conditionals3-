package day_26_arraywithchar;

public class TragetNumber {

	public static void main(String[] args) {
		
		 int[] arr= {1,4,5,9,2};
		 int targetNumber=7;
		 for(int i=0; i <arr.length; i ++) {
			 for(int j=0; j<arr.length; j++) {
				 if(arr[i] + arr[i] ==targetNumber) {
					 
					 //System.out.println(i + " " + j + " ");
				 }
				 System.out.println(i + " " + j );
			 }
		 }

	}

}
