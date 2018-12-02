package day_12_object_strings;

public class StringPositions {

	public static void main(String[] args) {
		 String alphabet ="ABCDEFGHIJKLMNOPQRSTUWXYZ";
		 System.out.println( alphabet.indexOf("A"));
		 int pPosition=alphabet.indexOf("P");
		 System.out.println("P is at index" +pPosition);
		 
		 int hijlocation=alphabet.indexOf("HIJ");
		 System.out.println(" hijLocation" + hijlocation);
		 String sentence ="Today is Sunday and tomorrow is Monday";
		 System.out.println(sentence.indexOf("Sunday"));
		 System.out.println(sentence.indexOf("a"));
		 System.out.println(sentence.lastIndexOf("a"));
		 System.out.println(sentence.indexOf("y",5));
		 System.out.println(sentence.indexOf("tomor"));
		 System.out.println(sentence.indexOf("is M"));
		 if(sentence.indexOf("and")>=0) {
			 System.out.println("Word is there");
		 } else {
			 System.out.println("Word is not there");
		 }
		 String searchResults="1-24 of over 50.000 results for Electronics: speakers";
		 

}
}
