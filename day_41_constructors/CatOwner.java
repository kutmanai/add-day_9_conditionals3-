package day_41_constructors;

import java.util.Scanner;

public class CatOwner {

	public static void main(String[] args) {
		

		Cat c= new  Cat("male ", "regular american");	
		 System.out.println(c.gender);
		 c.gender=" female";
		 
		 System.out.println(c.gender);
		 
		  Cat c4= new Cat("female", " British",6);
		  System.out.println(c4.gender);
		  System.out.println(c4.age);
		  System.out.println(c4.breed);
		

	}

}
