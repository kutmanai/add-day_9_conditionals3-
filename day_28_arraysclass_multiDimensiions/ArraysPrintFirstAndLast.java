package day_28_arraysclass_multiDimensiions;

public class ArraysPrintFirstAndLast {

	public static void main(String[] args) {
		 String[] words= {"hello","why","by","apple","note","water"};
//		 for( String word:words) {
//			 System.out.print(word.charAt(0));
//			 System.out.println(word.charAt(word.length()-1));
//			 
//		 }
		 //using single println  statement
        
//		 for( String word:words) {
//			// System.out.print(word.charAt(0));
//			 System.out.println( word.charAt(0) + "" +word.charAt(word.length()-1));
//			 
//
//	}
		 //Using Substring
//		  for( String word:words) {
//			
//			 System.out.println(word.substring(0,1));
//			 System.out.println(word.substring(word.length()-1));
//			 
		 // Print in single line
			 for( String word:words) {
					
				 System.out.println(word.substring(0,1) + word.substring(word.length()-1));
				 
		 

}
			 for(int i=0; i<words.length; i++) {
				 System.out.println(words[i].substring(0,1) + words[i].substring(words[i].length()-1));
			 }
			 
}
}