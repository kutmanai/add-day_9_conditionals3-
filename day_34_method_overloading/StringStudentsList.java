package day_34_method_overloading;

import java.util.Arrays;

public class StringStudentsList {

	public static void main(String[] args) {
		String [] name= { "James", " John", "John Wick","Elize"};
		
		
		names(name);
		
	}
	public static void names(String [] lastName) {
		 int count =0;
		 for(String last:lastName) {
			 last=last.trim();
			 if(last.contains(" ")) {
				 //System.out.println(last);
				 count ++;
			 }
		 }
		  String [] newArray= new String[count];
		  int index=0;
		  for(int i=0; i<lastName.length; i++) {
			  
			  String name1=lastName[i];
			  name1=name1.trim();
			  if(name1.contains(" ")) {
				  newArray[index]=name1;
				  index++;
			  }
		  }
		  System.out.println(Arrays.toString(newArray));
		
			
			
			
				
				
			
			
			
		}
		
	}


