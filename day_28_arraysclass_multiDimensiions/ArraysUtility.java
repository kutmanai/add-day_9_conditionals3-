package day_28_arraysclass_multiDimensiions;

import java.util.Arrays;

public class ArraysUtility {

	public static void main(String[] args) {
		
       String[] students= {"james", "john","donald", "adam", "obama"};
       System.out.println(students);
       System.out.println(Arrays.toString(students));
       for(String student:students) {
    	   if(student.equals("jamie")) {
    		   System.out.println("True");
    		   break;
    		   
    	   }
       }
       Arrays.sort(students);
          int i=Arrays.binarySearch(students,"john");
          System.out.println(i);
          
	}
	

}
