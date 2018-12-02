package mentoringsession;

import java.util.Scanner;

public class Freestyle {

	public static void main(String[] args) {
//		 while (condition) {
//			 //Statement to repeat
//			 //change the condition
//			 
//		 }
//		 
//		 do {
//			 // statement to repeat
//			 //change the condition
//			 
//			 
//		 }while(condition);
//		 
//		 for(int i=0; i<args.length; i++) {
//			 //loop body
//			 //statement loop
//		 }
   
		
		Scanner user = new Scanner (System.in);
		String answer="";
		
		
		//Kid wants a candy, asks his father until he gets the candy 
		
		 do {
			 System.out.println(" Dad please , can i have a candy?");
			 answer=user.next();
			 
		 }while(!answer.equalsIgnoreCase("ok"));
		 System.out.println("Thank you dady , you are the best.....");
		 
		
		
		
	}

}
