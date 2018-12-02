package day_14_stringmanipulation;

public class SubStringExample {

	public static void main(String[] args) {
		//substring gets part of a string
		//they are two versions, 1 take , 1 int , 1 takes 2 ints
		// if it takes 1 int . it means starting point
		
		 String str= "donuldtheduck@gmail.com";
		 System.out.println(str.substring(14)); 
		 
		 // we cannot give a number bigger than the length , it will throw exception
		 //if we give number equal to the length . it will return empty string.
		 // 2INT
		 //first number is the where the new string will string from second number is where the new string will end
		 System.out.println(str.substring(6,13));
		 System.out.println("abc".substring(0,1));
		 

	}

}
