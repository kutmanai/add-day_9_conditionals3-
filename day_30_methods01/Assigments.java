package day_30_methods01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assigments {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		/*
		 * Pseudo code
		 * 1.Find the size   of an actual elements from the file 
		 * 2.Create  a new  String array with that size 
		 * 3.Iterate through each element again and assign elements to the newly created array
		 * 
		 * 
		 */
			File file = new File("test.txt");
					
             
			Scanner sc=new Scanner(file);
			 int count =0;
			 while(sc.hasNextLine()){
				 
			 String name = sc.nextLine().trim();
			 // variable name gives each name from the test.txt file
			// System.out.println(name);
			 if(name.isEmpty()) {
				  continue;
			 }
			 
			 count++;
			 }
			 
			
			 //continue--> skips the current iteration
			 System.out.println("Count :" +count);
			 //Creating the new array with size of count
			 String [] students =new String[count];
			 
			
			 Scanner scan = new Scanner(file); //Creating scanner for the file again to iterate through one more time
			 int index=0; //iterating through lines and assigning value to newly created array
			 while(scan.hasNextLine()) {
				 String name2=scan.nextLine().trim();
				 
				 if(name2.isEmpty()) {
					 continue;
				 }
				 students[index]=name2;
				 index ++;
			 }
			 
			 System.out.println(Arrays.toString(students));
			 System.out.println("-------------------\n");
			 generateNewGroup(students,5);
			 


	}
	/*
	 * Pseudo code :
	 * 0.Create  New String with the given size of group.
	 * 1.Generate unique number for index to pick randomly one name.
	 * 2.Store value to the  newly created array
	 */
	public static void generateNewGroup(String[] students, int groupSize) {
		  
		 String [] newGroup= new String[groupSize];
		    int [] indexes = unigRandomNumbers(groupSize,students.length);
		  System.out.println(Arrays.toString(indexes));
		  for(int i=0; i <indexes.length; i++) {
			  System.out.println(indexes[i]);
			  int tempIndex=indexes[i];
			  newGroup[i]=students[tempIndex];
		  }
		  System.out.println(Arrays.toString(newGroup));
		  
		 
		
	}
	public static  int [] unigRandomNumbers( int size , int bound){
		int [] result=new int[size];
		Random random=new Random();
		boolean check=true;
		int index=0;
		while(check) {
			int ranNum=random.nextInt(bound);
			if(!checkNumberinArray(result,ranNum)) {
				result[index]=ranNum;
				index ++;
			}
			if(index==size) {
				check=false;
			}
					
			
		}
		return result;
		 
		
	
		
	}
	public static boolean checkNumberinArray(int [] arr,int target) {
		for( int i:arr) {
			if(i==target) {
				return true;
			}
		}
		return false;
		
	}

}
