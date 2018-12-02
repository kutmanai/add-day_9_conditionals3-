package homework_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithCustomMethodAssignments {

	public static void main(String[] args) {
		/*
		 * //1. Create array of String with the size of users choice. This array(collection) represents
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
		 * 
		 * 
		 * 
		 * 
		 */
		 
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter size of group");
		 int  size = scan.nextInt();
		 String [] students = new String[size];
		 int num=0;
		  for( int i =0; i<students.length; i++) {
			  System.out.println(" Please enter name of students");
			  students[i]=scan.next();	  
			  
		  }
		  
		  System.out.println(Arrays.toString(students));
		  studentsName(students);
		  System.out.println("Please enter any char");
		    char sh=scan.next().charAt(0);
		  charName(students,  sh);
		
		
		
	}
	////Create method that prints out the student name that starts with ‘a’ or ‘A’.
	
	
	 public static  void studentsName( String [] anyName  ) {
		 for( int i=0; i<anyName.length; i++) {
			 if(  anyName[i].charAt(0)=='a' || anyName[i].charAt(0)=='A') {
				 System.out.println(anyName[i]);
				 
			 }
		 }
		 
	 }
	 ////3. Create method that takes char and prints out student name that starts with given char
	 public static void charName(String [] studentsName ,char c ) {
		 for(int j=0; j<studentsName.length; j++) {
			 if(studentsName[j].charAt(0)==c) {
				 System.out.println(studentsName[j]);
			 }
			 
		 }
		 
	 }
	 
	 
	 
	
	

	
	
	

}
