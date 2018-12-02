package day_8_conditionals2;

import java.util.Scanner;

public class ChooseAlanguage {

	public static void main(String[] args) {
		System.out.println("Please select: English->1 \n" +
				    "Spanish->2 \n"+  
				     "Turkish->3 \n"+
				      "Russian->4 \n"+
				       "Uyghur-> 5 \n"+
				     
				        "Uzbek->6 \n" +
				        "Kyrgyz->7 \n"+
				        "Tajik ->8\n"); 
				        
 Scanner scan =new Scanner(System.in);
		int language =scan.nextInt();
		String greeting;
		if (language == 1) {
			
			greeting = " Hello, How are you?";
		} else if  (language == 2){
			greeting ="Como estas?";
			
		} else if (language == 3) {
			greeting ="Merhabla";
			
		} else if (language == 4) {
			greeting="Kak dela?";
		} else if (language == 5) {
			
            greeting="Yagshymysyn?";
			
		} else if (language == 6) {
			greeting ="Assalom Aleikum";
		} else if (language == 7) {
			greeting ="Salam kandaisyn?";
		} else if (language == 8) {
			greeting ="Salam";
		} else  {
			greeting ="I am sorry , i don't speak that languages here";
		}
		 System.out.println(greeting);
	} 
	

}
