package repeattask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndArrayListExamples {
	public static void main(String[] args) {
		
		
		int arr[]= new int []{1,6,3,5,4,2,10,8,9,7};
		//System.out.println(Arrays.toString(arr));
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
		 int index=Arrays.binarySearch(arr, 9);
		
		 System.out.println("Position of 9  in sorted" +"arrays is +\n" +index);
		  int[] copy=Arrays.copyOf(arr, arr.length);
		  System.out.println(Arrays.toString(copy));
		   Arrays.fill(arr, 10);
		   System.out.println(Arrays.toString(arr));
		   
		   ArrayList<Integer> list= new ArrayList<>(arr.length);
		   for(int  i:arr) {
			   list.add(Integer.valueOf(i));
		   }
		   System.out.println(list);
		  
		    int[] arr1= {1,2,3,4,5};
		   List<int[]> list1=Arrays.asList(arr1);
		   System.out.println(Arrays.toString(list1.get(0)));
		   
		   //1 General ArrayList
		   ArrayList list2= new ArrayList();
		   list2.add("java");
		   list2.add("selenium");
		   list2.add(1234);
		   list2.add(true);
		   System.out.println(list2);
		   
		   //2 Restricted
		   ArrayList<String> names=new ArrayList<>();
		       names.add("Kutmanai");
		       names.add("Ajara");
		       names.add("James");
		       names.add("John");
		       names.add("Nargiza");
		       //System.out.println(names.get(0));
		       names.remove(0);
		       System.out.println(names);
		        ArrayList<Integer> nums= new ArrayList<>();
		        nums.add(23);
		        nums.add(67);
		        nums.add(20);
		        nums.add(100);
		        System.out.println(nums);
		        
		   
	}
	
	

}
