package day_48_overriding;

import day_40_classes_objects.Dog;

public class SoccerPlayer extends Human {
	 int jerseyNumber;
	 String name;
	 
	 @Override
	 public void run() {
		 System.out.println("Soccer player is running");
		 
	 }
	 @Override
	 public Dog hunt() {
		 return null;
	 }
	 
	 @Override
	 
	 public void basketbowlPlayer() {
		 System.out.println("Basketbowl player");
		 
		 
	 }
	
	 public static void sleep() {
		 System.out.println("Soccer players are sleeping");
	 }
	 
	 final  public void train() {
		 System.out.println("Soccer player is training");
	 }
	 
	 public void bycycleKick() {
		 System.out.println("Soccer player is bycycle  kicking");
		 
	 }

}
