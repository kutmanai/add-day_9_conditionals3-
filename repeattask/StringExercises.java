package repeattask;

import java.util.Scanner;

public class StringExercises {

	public static void main(String[] args) {
		
         Scanner scan = new Scanner(System.in);
         System.out.println(" enter a word please:");
         String word=scan.next();
         String peace1=word.substring(0,word.length()-2);
         System.out.println(peace1);
         String peace2=word.substring(word.length()-2);
         System.out.println(peace2);
         String peace3=word.substring(word.length()-2,word.length()-1);
         System.out.println(peace1 +peace2+peace3);

	}

}
