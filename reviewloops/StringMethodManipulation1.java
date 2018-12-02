package reviewloops;

import java.util.Scanner;

public class StringMethodManipulation1 {

	public static void main(String[] args) {
		
               String word="Java exercises";
               System.out.println(word.charAt(0));
               System.out.println(word.charAt(10));           
               
               Scanner scan =new Scanner(System.in);
               System.out.println(" Enter word one");
               String word1=scan.nextLine();
               System.out.println("Enter second word");
               String word2=scan.nextLine();
               
               if(word1.length()==word2.length()) { // if length of word1==word2
            	   System.out.println(" They are a equal"); //prints out this statement
               }else{
            	   System.out.println( "They are not equal");
            	   
               }
               
               

	}

}
