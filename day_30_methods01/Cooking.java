package day_30_methods01;

public class Cooking {

	public static void main(String[] args) {
		
		cook("Steak");
		youWillNeed("Meat, Oil,Salt,peper,Wooden Spoon,tomato,onion,garlic");
		cookFor(10, "Grilling");
		ready();
		/*
		 * 
		 * method Cook accepts A String food name, prints
		 * "Today we are coolking  foodName"
		 */
		
		/*
		 * 
		 * method  youwillNeed, accepts a String with things we need
		 * prints "We need following iyems: items"
		 */
		
		/*
		 *  method cookFar accets minutes and  way of cooking prints:
		 *  "You need to cook for minutes by means of wayOfCooking
		 * 
		 */
		/*
		 * 
		 */
		
		/*
		 * 
		 * method ready , does not accepts any parameters,
		 * prints: "Meal is ready enjoy"
		 */
		
	}
	
	public static void cook (String foodName) {
		System.out.println("Today we are cooking " +foodName+ ".");
		
	}
	public static void youWillNeed(String items) {
		System.out.println("We need following items:" +items +".");
	}
	public static void cookFor(int minutes , String wayOfCooking) {
		System.out.println("You need to cook for " + minutes + "minutes by"+wayOfCooking);
	}
	public static void ready() {
		System.out.println("Meal is ready enjoy!");
	}
	

}
