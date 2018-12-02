package day_48_overriding;

import day_40_classes_objects.Dog;

public class Human {
	String gender;
	int age;
	
	
	public static void sleep() {
		System.out.println("Players are sleeping");
		
	}
	public void run() {
		System.out.println("Human is running");
	}
	
	public Dog hunt() {
		Dog a= new Dog();
		
		return  a;
	}
	
	public void eat() {
		System.out.println("Human is eating");
	}

	public void basketbowlPlayer() {
		System.out.println("Good player");
		
	}

}
