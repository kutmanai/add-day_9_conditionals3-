package day_36_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTask2 {

	public static void main(String[] args) {
//		2. Create a program that asks names from user using Scanner and keep adding each name to list. Then ask user if user wants to continue adding names and keep adding to the list. 
//		In the end print 
//		
		boolean check=true;
		List<String> names= new ArrayList<>();
		Scanner  scan = new Scanner(System.in);
		
		while(check) {
			System.out.println("Please enter name:");
			names.add(scan.nextLine());
			System.out.println("Do you want to continue adding name? Yes/No");
			String answer=scan.nextLine();
			if(answer.equalsIgnoreCase("no")) {
				check=false;
			}
		}
		System.out.println(names);
		
	}

}
