package repeattask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExamples {

	public static void main(String [] args) {
		
		  int [] numbers= {1,4,89,9,8,10,5,3};
		  System.out.println(Arrays.toString(numbers));
		 // Arrays.sort(numbers);
		  System.out.println(Arrays.toString(numbers));
		  //System.out.println(Arrays.toString(arr));
			 int index=Arrays.binarySearch(numbers, 9);
			 
			 System.out.println(index);
		   
			 int[] copy = Arrays.copyOf(numbers, numbers.length); 
		        System.out.println("Copied array => \n" +  
		                           Arrays.toString(copy));
		        
		        int arr[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
		        Arrays.fill(arr, 10); 
		                System.out.println("Array completely filled"+ 
		                          " with 10=>\n"+Arrays.toString(arr)); 
		       // Output:[10, 10, 10, 10, 10, 10, 10, 10, 10]
		                 arr[0]=15;
		                 
		                 System.out.println(Arrays.toString(arr));
		                 
		                 ArrayList<Integer> list= new ArrayList<>(arr.length);
		      		   for(int  i:arr) {
		      			   list.add(Integer.valueOf(i));
		      		   }
		      		   System.out.println(list);
		      		   
		      		   
		      		   List<String> names=new ArrayList<>();
		      		   
		      		   names.add("Chynara");
		      		   names.add("Nariste");
		      		   names.add("Jazgul");
		      		   names.add("Aigul");
		      		   names.add("Elif");
//		      		   System.out.println(names);
//		      		   
//		      		    System.out.println(names.size());
//		      		     System.out.println(names.get(0));
//		      		     names.remove(1);
//		      		     System.out.println(names);
//		      		     
//		      		      for(int i =0; i<names.size(); i++) {
//		      		    	  names.remove(i);
//		      		    	  
//		      		    	  
//		      		    	  //System.out.println(str);
//		      		      }
//		      		    System.out.println(names);
		      		   
		      		   names.removeAll(names);
		      		   System.out.println(names);


	}
}
