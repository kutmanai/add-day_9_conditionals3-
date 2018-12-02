package day_26_arraywithchar;

public class ToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="Hello";
		 char[] letters=word.toCharArray();
		  for( char letter : letters) {
			  System.out.println(letter);
		  }
		  
		  String gift="Diamnod Ring";
		  //convert to charArray.and print reverse
		  
		  char[] present=gift.toCharArray();
		  for(int i=present.length-1; i>=0; i--) {
			  System.out.print(present[i]);
		  }

	}

}
