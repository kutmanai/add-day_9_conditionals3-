package day_17_reviewsession2;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
	 Scanner scan =new Scanner(System.in);
	 System.out.println("What is the word?");
      String word=scan.next();
	       if (word.length()>=4) {
	      if (word.charAt(0)==word.charAt(word.length()-1)) {
	    	  
	    	  System.out.println("Firsts same");
	      }
	      
	      if(word.charAt(1)==word.charAt(word.length()-2)) {
	    	  System.out.println("Second  Same");
	      } 
	      
	      
	      
	   
	

	       
	       }else {
	    	   System.out.println("Error: at least 4 chars required for this program");
	       }

}

}