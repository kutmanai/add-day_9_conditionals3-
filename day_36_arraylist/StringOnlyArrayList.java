package day_36_arraylist;

import java.util.ArrayList;

public class StringOnlyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		//names= new ArrayList<>();
		names.add("Java");
		names.add("Eclipse");
		names.add(" Kutmanai");
		names.add("Cam");
		names.add("Khalili");
		names.add("Anastasia");
		System.out.println(names);
		names.add("James");
		System.out.println(names);
		//get size/ number of elements
		int length=names.size();
		System.out.println("Number of Names " + length);
		//read first person name
		String first=names.get(0);
		System.out.println("First name" + first);
		String last = names.get(names.size()-1);
		System.out.println("last:" +last);
		//remove the element from the list
		names.remove(0);
		System.out.println(names);
		names.remove(2);
		//names.remove("Cam"); the same like above should work too
		System.out.println(names);
		
		
	}

}
