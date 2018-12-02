package day_28_arraysclass_multiDimensiions;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		//Sort method of Arrays class
		int[] nums= {9,4,1,0,5,3,10,-4};
		for(int n :nums) {
			System.out.print(n+ " ");
		}

		System.out.println();
		Arrays.sort(nums);
		 for(int n:nums) {
			 System.out.print(n +" ");
		 }
		 System.out.println();
		 
		 String[] names= {"Said","John", "Asel", "Alisiay", "Mijat", "Tariq", "Z","Khalili"};
		 Arrays.sort(names);
		 for(String name:names) {
			 System.out.print(name + " "); //sorting from begining and the end of alhabit
		 } 
			 System.out.println();
			 char[] charArray= {'c','C','D','A', '2'};
			 Arrays.sort(charArray, 0,3); //partial sort if needed
			 for(char ch:charArray) {
				 System.out.print(ch + " ");
			 }
		 }
		 
	}


