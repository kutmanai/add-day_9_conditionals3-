package day_12_object_strings;

public class StartAndWords {

	public static void main(String[] args) {
		String word1="javva";
		String word2="appl";
		if(word1.length()!=5 || word2.length()!=5) {
			System.out.println("need to be exactly 5 chars length");
		} else if(word1.charAt(4)==word2.charAt(0)) {
			System.out.println("Fizz");
		}else {
			System.out.println(" Buzz did not match");
			
		}
		
		if(word1.length()==5 && word2.length()==5) {
			if (word1.charAt(4)==word2.charAt(0)) {
				System.out.println("Fizz");
			}
		} else {
			System.out.println("Buzz did not match");
			
		}
		


	}

}
