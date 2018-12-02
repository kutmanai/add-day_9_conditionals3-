package day_33ArraysAndMethod;

import java.util.Arrays;

public class MiracleWithCharAndString {
	/*
	 * 
	 * Create method that accepts String and returns character array.
	 * Input: “James”Output: [j, a, m, e, s]
	 */

	public static void main(String[] args) {
		 char[] mm= CharArray("Kutmanai");
		 System.out.println(Arrays.toString(mm));
		 

	}
	public static char [] CharArray( String  word) {
	     int size = word.length();
	     System.out.println("Size " +size);
	     char [] myChars=new char[size];
	     for( int i=0; i<size; i++) {
	    	// System.out.println(word.charAt(i));
	    	 myChars[i]=word.charAt(i);
	     }
	     System.out.println(Arrays.toString(myChars));
	     
	   
	  return myChars;
 }

}
