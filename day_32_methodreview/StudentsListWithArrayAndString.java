package day_32_methodreview;

import java.util.Arrays;

import java.util.jar.Attributes.Name;

public class StudentsListWithArrayAndString {

	public static void main(String[] args) {
		/*
		 * Pseudo code
		 * Create a method that takes / accepts String array
		 * And Returns String array
		 * 
		 * Logic: method should find an element that consist of two or more words and return that
		 * input:{"James Bond", "Donald Trump Junior","Adam","John Wick"};
		 * output:["James Bond","John Wick"];
		 * 
		 */
		String [] names= {"James Bond", "Donald Trump Junior","Adam","John Wick"};
		String [] newarr=getNamesWithLastNames(names);
		System.out.println(Arrays.toString(newarr));
		//getNamesWithLastNames();
		//System.out.println(Arrays.toString(names));
		 
		//Create a method that takes array of String —> Students listAnd returns array of String —> Students that has last namesInput: 
		//[“James”, “john”, “John Wick”, “Elize”]Output: [“John Wick”]
		

	}
	//1.Count the elements that has two or more words
	// Create array of Strings with the count size
	//3. Iterate through each element again and set elements with two or more owrds to newly created array
	public static String [] getNamesWithLastNames( String[] names) {
		int count=0;
		 
			for(String  name:names) {
				//name.contains("");
				System.out.println(name);
				name=name.trim();
				int numOfWords=name.split(" ").length;
				if(numOfWords>1) {
					count ++;
				}
				
			}
			String [] result= new String[count];
			int index=0;
			for(String  name:names) {
				name=name.trim();
				int numOfWords=name.split(" ").length;
				if(numOfWords>1) {
					result[index]=name;
					index ++;
				}
				
			}
			return result;
			
		 
		 
		 
		
	}

}
