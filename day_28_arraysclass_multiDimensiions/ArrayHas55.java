package day_28_arraysclass_multiDimensiions;

public class ArrayHas55 {

	public static void main(String[] args) {
		  int num[]= {45,15,35,45,5};
		  //check if  5 and are  in positions next to one other
		   boolean found=false;
		  for(int i=0; i< num.length-1; i++) {
			// System.out.println(num[i]);
			 if(num[i] ==5 && num[i +1]==5) {
				 found=true;
				 break;
			 }
		  }
		  System.out.println(found);
		  //num[i+1] if i is 1 , we are making it 2 and reading index 2
		  //num[i] +1 read the value in the arrays and add 1 to it.
		  // 5+1->6
		  

	}

}
