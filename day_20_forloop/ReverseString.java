package day_20_forloop;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * 
		 * take String variable word and reverse it using for loop
		 * ex;
		 * java
		 * avaj
		 * civic
		 * 
		 */ 
		 String word ="java";
		 String reversed ="";
		 
		 //using for loop-loop from length of word -1 until 0
		 //and use eihtecharAt or subtsring and odd that character to reversed sstring
		 
		 for(int idx=word.length()-1;idx >=0; idx--) {
			 word.charAt(idx);
			 reversed=reversed+word.charAt(idx);
		
		 }
		 System.out.println(reversed);
		 // how many times message will be printed 1,2,3,4,5,
		// mentoring session:
	}

}
