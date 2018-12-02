package repeattask;

import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		System.out.println(" enter a word please");
		String word=scan.next();
		 if(word.length()<2) {
			 System.out.println("Error it should be 2 or more letters");
		 }else {
		String newWord=""+word.charAt(0)+ word.charAt(1);
		 newWord=newWord.concat(newWord).concat(newWord);
		 System.out.println(newWord);
		 }

	}

}
