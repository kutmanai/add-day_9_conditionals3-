package day_32_methodreview;

import java.util.Arrays;

public class StringWithArrayStudentsList {

	public static void main(String[] args) {
		String [] names= {"James Bond", "Obama", "Donald Trump Junior","Adam Smith","John Wick"};
		 String [] myNames=twoAndMoreWords(names);
		 System.out.println(Arrays.toString(myNames));
		
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
		
		
	}
	 public static String [] twoAndMoreWords( String [] nameList) {
		 int count =0;
		  for(String  name:nameList) {
			  name=name.trim();
			  //System.out.println(name);
			  if(name.contains(" ")) {
				  System.out.println(name); 
				  count++;
			  }
			  
			  
		  }
		  String [] newArray=new String[count];
		 // System.out.println("Count:" +count);
		  int index=0;
		  for(int i=0; i<nameList.length; i++) {
			 String name1=  nameList[i];
			 name1=name1.trim();
			// System.out.println(name1);
			 if(name1.contains(" ")) {
				 newArray[index]=name1;
				 index ++;
			 }
		  }
		 // System.out.println(Arrays.toString(newArray));
		 return newArray;
	 }

}
