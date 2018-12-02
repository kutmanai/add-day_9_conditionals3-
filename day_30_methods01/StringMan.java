package day_30_methods01;

public class StringMan {

	public static void main(String[] args) {
		
          char c= getFirstChar("Obama");
          System.out.println(c);
		

	}
	
	public static char getFirstChar(String word ) {
		char firstChar=word.charAt(0);
		return firstChar;
	}

}
