package array_assignments;

import java.util.Arrays;

public class StringEmailArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print 
		//Email id:info
		//Email domain:cybertekshool.com
		 //if emial contains no @ or multiple @ characters then print invalid email
		String email="info@cybertekshool.com";
		String[]splittedEmail=email.split("@");
		System.out.println(Arrays.toString(splittedEmail));
		if(!email.contains("@") || splittedEmail.length>2) {
			System.out.println("Print invalid email");
		}else {
			 System.out.println(" Email id: " + splittedEmail[0]);
			 System.out.println("Email domain :" + splittedEmail[1]);
		}

	}

}
