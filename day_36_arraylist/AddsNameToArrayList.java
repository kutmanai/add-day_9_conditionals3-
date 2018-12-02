package day_36_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddsNameToArrayList {

	public static void main(String[] args) {
//		1.Create a program that asks 5 names from user using Scanner and keep adding each name to List of String collection.
//		And print out list of names in the end.
//		
        Scanner scan = new Scanner(System.in);
        List<String> names= new ArrayList<>();
        for(int i=0; i<5; i++) {
        	System.out.println("Please enter name " +(i+1) + ":");
             names.add(scan.nextLine());
             
        
         
         }
        System.out.println(names);
        //boolean check= names.remove(0);
        names.remove(0);
        System.out.println(names);
        
        
       
        
        

	}

}
