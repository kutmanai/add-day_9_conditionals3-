package day_28_arraysclass_multiDimensiions;

import java.util.Scanner;

public class SplitEmailWithChar {

	public static void main(String[] args) {
		
			    Scanner input = new Scanner(System.in);
			    String email = input.nextLine();
			     if(!email.contains("@")) {
			    	 System.out.println("invalid email");
			    	 return;
			    	 
			     }
			     
			     for(int i=0; i<email.length();i++) {
			    	 for(int j=0; j<email.length(); j++) {
			    		 if(i !=j) {
			    			 if(email.charAt(i)=='@' && email.charAt(j)=='@') {
			    				 System.out.println("invalid email");
			    				 return;
			    			 }
			    		 }
			    	 }
			     }
			     String[] b=email.split("@");
			     System.out.println("Email id :" +b[0]);
			     System.out.println("Email domain :" + b[1]);
 

	}

}
