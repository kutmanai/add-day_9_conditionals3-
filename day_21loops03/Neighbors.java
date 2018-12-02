package day_21loops03;

public class Neighbors {

	public static void main(String[] args) {
		/*
		 * String word and you need to check for same character side by side
		 * if found say "baap-" character
		 * ex:
		 * abccddefg
		 * cc baap-c
		 * dd Baap-d
		 */
		
		  String word ="javvva";
		   for(int n=0; n <word.length()-1; n++) {
			   if (word.charAt(n)==word.charAt(n+1)) {
				   System.out.println("Beep- " +word.charAt(n));
			   }
			   
		   }
		  // System.out.println("Beep - !!!" );
		   
		   
		   String word1 ="javvva";
		   for(int n=0; n <word.length()-1; n++) {
			   if (word.substring(n,n+1).equals(word.substring(n+1,n+2))) {
				   System.out.println("Beep- " +word.substring(n,n+1));
			   }
			   
		   }
		  

	}

}
