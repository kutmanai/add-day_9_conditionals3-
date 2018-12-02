package day_37_wrapperclasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListAssigments {

	public static void main(String[] args) throws FileNotFoundException {
 // 1. Write a program that reads values(student names) from test.txt file and stores each student name into list. 
//	Then print the size.Notice: test.txt file has empty lines which needs to be ignored when adding to list.
File file = new File("test.txt");
		
		Scanner sc=new Scanner(file);
		List<String> names= new ArrayList<>();
		
        while(sc.hasNextLine()){
        	   names.add(sc.nextLine().trim());     	  
        	  if(names.isEmpty()) {
        		  continue;
        	  }
        	 
        }
        System.out.println(names);
        System.out.println(names.size());
        printStudents(names);
        System.out.println("\n----\n");
        studentsLength(names ,5);
        
        System.out.println("\n----\n");
		printFromShortToLongest(names);
        
        
       


	}
// 2.	Create a method that accepts List of String(student names)and 
//	prints out in the following format. Ele1 - ele2 - ele3 - ele4 - ele5Ele6 - ele7 - ...
//	Notice: One line should only consist of 5 elements.
	public static  void  printStudents(List <String> students) {
		//System.out.println(students);
		//iterate through the list
		//keep printing in one line with dash separated
		//apply condition to check is already printed 5 students
		//when we hit condition we start new line
		
		int num=4;
		for(int i=0; i< students.size(); i++) {
			
			if(i==num) {
				System.out.print(students.get(i));
				System.out.println();
				num +=5;
			}else {
				System.out.print(students.get(i) + "-");
				
			}
			
		}
	}
//	3. Create a method that takes List of String(Students) and integer(length) and 
//	 print out student name with given length.
	  
	 public static void  studentsLength(List <String> students1, int size) {
		 int count=0;
		  for( int i =0; i<students1.size(); i++) {
			   if(students1.get(i).length()==size) {
				    count ++;
				   
				   
	System.out.println( students1.get(i));
			   }
		  }
		  
		 
	 }
	  //4.Create a method that takes List of String(Students) and print out student names from shortest length to longest length.
//	   Notice: Assume that shortest length is 3 
//	   letters and longest is 15 letters.
	     public static void printFromShortToLongest(List<String> students) {
	    	  for(int i=3; i<16; i++) {
	    		  studentsLength(students,i);
	    		  
	    	  }
	    	 
	     }

}
