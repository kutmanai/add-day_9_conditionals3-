package day_11_switchstatement;

import java.util.Scanner;

public class CheckClass {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter  Day");
		int day=scan.nextInt();
		String  classAtSchool="";
		 String weekdayName="";
		if(day==1) {
			classAtSchool="Monday";
			
		}else if(day==2) {
			classAtSchool="Java Programming";
			weekdayName="Tuesday";
			
		}else if(day==3) {
			classAtSchool="Java Programming";
			weekdayName="Wednesday";
			
		}else if(day==4) {
			classAtSchool="Manual testing";
			weekdayName="Thuersday";
			
		}else if(day==5) {
			classAtSchool="No class";
			weekdayName="Friday";
			
		}else if(day==6) {
			classAtSchool="Java Programming";
			weekdayName="Saturday";
			
		}else if(day==7) {
			classAtSchool="Java Programming";
			weekdayName="Sunday";
			
		}else {
			System.out.println("Error:invalid day");
		}
		System.out.println("Day of week " +weekdayName +"\n"+"Class:" +classAtSchool);
			
		
	
	}

}
