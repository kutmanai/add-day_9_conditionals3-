package mentoringsession;

public class Split {

	public static void main(String[] args) {
		
		
		/* If you have a senyence - how do you find out how many 
		 * words you have in ? 
		 * Interview question:
		 *  1) Way count number of spaces  
		 */
		
		String sentence = "find out how many";
		/* 1)how many characters in sentence :10
		 * 2) replace each space with empty-> " " -> " "
		 * 3) how many characters in sentence  7
		 * 4) do substraction 10-7->3+1
		
		*/
		
		int before = sentence.length();
		sentence=sentence.replaceAll(" ", "");
		int after=sentence.length();
		int numberOfWords=before-after +1;
		System.out.println(" Number of words: " + numberOfWords);
		
		// Using split  method in String class
		sentence="find out how many";
		String[]arrWords=sentence.split(" ");
		
		System.out.println("Number of words:" +arrWords.length);
		//{"find", "out","how", "many"}
		
		for (String word: arrWords) {
			System.out.println(word);
		}
		
		
		 
		
		
		
	}
	

}
