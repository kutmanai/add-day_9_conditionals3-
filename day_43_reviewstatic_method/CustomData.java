package day_43_reviewstatic_method;

import java.util.Random;

public class CustomData {
//	Warm up:1.Create class CustomDataCreate static method generateUsername. 
//	This method should accept string and return String. Logic: check if given string is one word or more. 
//If more, then concatenate all together and add random number between 0 - 100. Return only lower case string.
//Input: James Bond Output: jamesbond74Input: JohnOutput: john23
//	
	
	
	
	public static void main(String[] args) {
		String s=genereteUsername(" Bond");
		System.out.println(s);
		String s2=generetePassword("Adam Smith");
		System.out.println(s2);
	}
	
	   public static  String genereteUsername(String word) {   
		  
		   word=word.replace(" ", "");
		   Random r= new Random();
		   word=word+r.nextInt(100);
		    return word.toLowerCase();
		   
	   }
	  public static String generetePassword(String word) {
		  word=word.replace(" ", "");
		  StringBuilder sb= new StringBuilder(word);
		  sb.reverse();
		  Random r= new Random();
		  sb.append(r.nextInt(500));
		  return sb.toString().toLowerCase();
	  }
	 
	 
	 
	 
	 
	 
	 }
	 




