package day_47accessmodiffier02;

import abstraction_intro_interface.Building;
import day_48_overriding.SingleHouse;

public class Constrtion {

	public static void main(String[] args) {
		Building b= new Building("Trump Tower","Hotel", 5);
		System.out.println(b.toString());
		
		SingleHouse s= new SingleHouse("MyHouse","Single",3,99.9);
		System.out.println(s);
		
		s.addDoor();
		s.addFloor();

	}

}
