package day_36_arraylist;

import java.util.List;
import java.util. ArrayList;

public class WithFunction {

	public static void main(String[] args) {
		//add(list, "john","james","obama",...);
		/*
		 *  Create a custom method that accepts list of String, and accepts
		 *  String varags and adds all the given strings to the list and return
		 *  the list.
		 * 
		 */
		List<String> oldnames=new ArrayList<>();
		oldnames.add("Jason");
		oldnames.add("Adam");
		
		List<String> names=new ArrayList<>();
		names.add("James");
		names.add("john");
		System.out.println(names);
		add(names, "Trump","Elize","Esen","Obama");
		System.out.println(names);
		names.addAll(oldnames );
		System.out.println(names);
		
		
		

	}
	public static List<String> add(List<String> list, String ...elements){
		for(String str:elements) {
			list.add(str);
		}
		return list;
	}

}
