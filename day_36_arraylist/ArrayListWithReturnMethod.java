package day_36_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithReturnMethod {

	public static void main(String[] args) {
		
//		Create a method that accepts List of String and integer(size). This method should remove all the elements with given size. 
//		And returns new List of String which doesn’t include elements with given size.
//		 

		 List<String> name = new  ArrayList<>();
		 name.add("James");
		 name.add("Adam");
		 name.add("John");
		 name.add("Elize");
		 System.out.println(name);
		 removeElements(name,4);

	}
	 public static  void removeElements ( List<String> list , int size){
		 System.out.println(list);
		 List<String> newList= new ArrayList<>();
		
		   for(int i=0;  i<list.size(); i++) {
			   
			   if(list.get(i).length()!=size) {
				   
				    newList.add(list.get(i));
				  
			   }
		   }
		   System.out.println(newList);
		  
		 
		
		
		
	}
	

}
