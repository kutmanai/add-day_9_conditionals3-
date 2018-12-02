package day_38_recap_sb_wrapper_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringMethodWithBuilderString {

	public static void main(String[] args) {
//		System.out.println(removeCon("consequences"));
//		System.out.println(removeCon("constant value"));
//		System.out.println(removeCon("jemes"));
//		System.out.println(removeCon("concon"));
//		System.out.println(removeCon("co"));
//		System.out.println("---------------");
//		
			
		 System.out.println(removeCon("pineapple", " apple"));
		System.out.println(removeCon("Hello word, word"));
		System.out.println(removeCon("consequences","word"));
		System.out.println("------TASK3-------\n");
		System.out.println(getRandomNumList(7,50));
		

		/*
		 * 1. Create a method that accepts String. Method should check if given String
		 * contains word “con”. If yes then it removes word “con” from the given String
		 * and returns modified String. Special cases:1.You need to check if given
		 * String is ONLY one word. If given string is two or more words then print
		 * “Invalid data”, terminate the method and return empty String. 2.You need to
		 * check if given String length is at least 3. If less than 3 then print
		 * “Invalid data”, terminate the method and return empty String. 3.If given
		 * String doesn’t contain word “con” return the given word itself.Note: When
		 * removing word use StringBuilder’s delete method. Input: “Consequences”Output:
		 * “sequences”Input: “James”Output: “James”Input: “concept map”Output: print:
		 * “Invalid data” return value: “”
		 * 
		 * 
		 * 
		 */

	}

	public static String removeCon(String word) {
		word = word.toLowerCase().trim();
		if (word.contains(" ")) {
			System.out.println(" Invalid data");
			return "";
		} else if (word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		} else if (word.contains("con")) {
			StringBuilder sb = new StringBuilder(word);
			sb.delete(word.indexOf("con"), word.indexOf("con") + 3);
			return sb.toString();

		} else {
			return word;
		}

	}

	public static String removeCon(String word, String target) {
		word = word.toLowerCase().trim();
		target=target.toLowerCase().trim();
		if (word.contains(" ")) {
			System.out.println(" Invalid data");
			return "";
		}else if (word.length() < target.length()) {
			System.out.println("Invalid data");
			return "";
			
		}else if(word.contains(target)) {
			StringBuilder  sb= new StringBuilder(word);
			sb.delete(word.indexOf(target), word.indexOf(target) + target.length());
			return sb.toString();
		}else {
			return word;
		}
		

	}
	 /*
	  *  Create a method that takes integer(size), integer(bound) and returns List of Integers. 
	  *  Method idea: method should create list of integers and assign random numbers between zero to given bound. 
	  *  Size of list should be given size. 
	  * 
	  * 
	  */
	public static List<Integer> getRandomNumList(int size, int bound){
		Random random = new Random();
		List<Integer> nums= new ArrayList<>();
		for(int i =0; i<size; i++) {
			nums.add(random.nextInt(bound));
			
		}
		return nums;
		
		
	}
	
	

}
