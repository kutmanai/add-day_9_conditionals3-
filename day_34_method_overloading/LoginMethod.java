package day_34_method_overloading;

import java.util.Scanner;

public class LoginMethod {
//	Method name: login
//	Return type: void
//	Accepts 2 arguments
//	Parameter names; 
//	givenId
//	givenPassword
//	Provide within method
//	expectedId = "johnJava"
//	expectedPassword = "123456"
//
//	Create a logic that compares expectedId, and expectedPassword with givenId, givenPassword
//	Have the output as displayed.

	public static void main(String[] args) {
		 login("johnJava","123456");

	}
	public static void login(String expectedId, String expectedPassword) {
		
		System.out.println("You have pressed login button.");
		System.out.println("Please enter username.");
		Scanner scan = new Scanner(System.in);
		 String givenId= scan.nextLine();
		System.out.println("Please enter password:");
		 String givenPassword=scan.nextLine();
		
		if(expectedId.equals(givenId) && expectedPassword.equals(givenPassword)) {
			System.out.println("login Siccesfull");
		}else {
			System.out.println("Eihter the password or the account");
		}
	}
}