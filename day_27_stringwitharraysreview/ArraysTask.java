 package day_27_stringwitharraysreview;

public class ArraysTask {

	public static void main(String[] args) {
		
  String [] arr= new String[] { "apples","banana"," kiwi", "cherries"} ;
  for(String fruit : arr) {
	  System.out.println(fruit.substring(0,3));
  }
    System.out.println(" -------FOR LOOP----");
    for (int i =0; i<arr.length; i ++) {
    	System.out.println(arr[i].substring(0, 3));
    	
    }
	}

}
