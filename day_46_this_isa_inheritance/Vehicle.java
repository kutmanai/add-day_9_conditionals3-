package day_46_this_isa_inheritance;

public class Vehicle {

	String type;
	String color;
	int year;
	boolean isNew;
	
	
	public  void startingEngine() {
		System.out.println("Engine is starting");
		
	}
	public  void stopEngine() {
		System.out.println("Engine is stoping");
	}
	
	public static   void fixVehicle( String date) {
		System.out.println("Vehicle getting fixed on" +date);
		
	}
}
