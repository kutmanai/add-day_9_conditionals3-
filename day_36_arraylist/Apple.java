package day_36_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Apple {

	public static void main(String[] args) {
		List<String> names= new ArrayList<>();
		System.out.println("Size before adding elements:" +names.size());
		 names.add("James");
		 
		 names.add("John");
		 names.add("Trump");
		 names.add(3, "Obama");
		 System.out.println(" Size after elem:" + names.size());
		 System.out.println(names);
		  String myName= names.get(2);
		  System.out.println( names.indexOf("John"));
		  System.out.println(myName);
		 
	}
	//add(list, "john","james","obama",...);
	/*
	 *  Create a custom method that accepts list of String, and accepts
	 *  String varags and adds all the given strings to the list and return
	 *  the list.
	 * 
	 */
	  
		  
		  
		  
		  
		
	

}
