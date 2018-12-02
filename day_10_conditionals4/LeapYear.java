package day_10_conditionals4;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
	    Scanner scan =new Scanner(System.in);
	    System.out.println("Enter year");
	    int year=scan.nextInt();
	    if (year%400==0) {
	    	
	    	
	    }else if(year%4==0) {
	    	System.out.println(" It is a leap year");
	    }else if (year%4==0 && year%100!=0) {
	    	System.out.println(" It is a leap year");
	    }else {
	    	System.out.println("Not a leap year");
	    }
	    
	   // if (year%400==0 )|| (year % 4==0 && year % 100 ! =)) {
	    //	
	    	//System.out.println("");
	   // }
	  

	}

}
