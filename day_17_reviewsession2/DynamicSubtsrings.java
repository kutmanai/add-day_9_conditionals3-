package day_17_reviewsession2;

public class DynamicSubtsrings {

	public static void main(String[] args) {
		 String sentence="We are learning Python programming";
		 /*
		  *  indexOf accepts a string and finds the position
		  *  String str ="abc";
		  *  str.indexOf("b");->1
		  *  str.indexOf ("start")->4
		  *  finds the position of "learning"
		  *  finds the position of "programming"
		  *  pass those numbers to substring and retreive "C++".
		  */
		 
		   int start= sentence.indexOf("learning");
		   int end=sentence.indexOf("programming");
		  System.out.println( start);
		  System.out.println(end);
		  
		  start +="learning".length();
		  String language=sentence.substring(start,end);
		  System.out.println(language.trim());
		 
	}

}
