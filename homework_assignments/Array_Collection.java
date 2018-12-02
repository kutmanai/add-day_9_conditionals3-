package homework_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Collection {
	//1. Create array of String with the size of users choice. This array(collection) represents
//	one group.
//	Ask user to enter each member name and store that input to each index of created
//	array.
//	Then in the end print out the members in the format of [ ele1, ele2, ele3, …]
//	Program:
//	Please enter size of group:
//	input —> 3
//	Please enter member 1:
//	input —> James
//	Please enter member 2:
//	input —> John
//	Please enter member 3:
//	input —> Adam
//	Group members:
//	[James, John, Adam]

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Please enter size of the group");
	        int size = scan.nextInt();
	        String[] names = new String[size];
	        int num = 0;
	        for (int i = 0; i < names.length; i++) {
	            num++;
	            System.out.println("Please enter member " + num);
	            names[i] = scan.next();
	            hasA(names[i]);
	        }
	        System.out.println(Arrays.toString(names));
	        System.out.println("Please  enter any character");
	        char letter=scan.next().charAt(0);
	        anyChar(names, letter);
	    }
	//Create method that prints out the student name that starts with ‘a’ or ‘A’.
	    public static String hasA(String names) {
	        char a = names.charAt(0);
	        if (a == 'A' || a == 'a') {
	            System.out.println(names + ": starts with 'A' ");
	        }
	        return names;
	    }
	    //3. Create method that takes char and prints out student name that starts with given char
	    public static void anyChar( String[] names , char sh) {
	    	for(int i=0; i<names.length; i++) {
	    		if(names[i].charAt(0)==sh) {
	    			System.out.println(names[i]);
	    		}
	    		
	    	}
	    	
	    	
	    }
		

	}


