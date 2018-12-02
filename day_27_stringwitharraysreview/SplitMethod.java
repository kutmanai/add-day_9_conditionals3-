package day_27_stringwitharraysreview;

public class SplitMethod {

	public static void main(String[] args) {
		 
		String words="java-selinium-cucumber-testing-junit-eclipse-maven-git-github";
		 String []splittedWords=words.split("-");
		 System.out.println(splittedWords.length);
		 System.out.println(splittedWords[0]);
		
   for( String w:splittedWords) {
	   System.out.println(w);
   }
     String searchResults="All categories “wooden spoon personalised”(1,342 Results)";

     String [] arrResults= searchResults.split(" ");
     System.out.println(" Words count:" +arrResults.length);
     System.out.println(searchResults.split(" ").length);
     System.out.println(searchResults.split(" ")[0]);
     System.out.println("Wooden spoon count:" + arrResults[4] );

	}

}
