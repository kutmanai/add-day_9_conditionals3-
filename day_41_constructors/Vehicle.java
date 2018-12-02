package day_41_constructors;

public class Vehicle {
	
	private String type;
	private String model;
	private int   speed;
	
	public Vehicle() {
		System.out.println("Car class constructor");
		type="Unknown";
		model="Unknown";
		speed=0;
	}
	
	public Vehicle( String type, String model ,int speed) {
		System.out.println("3 args cunstructor");
		this.type=type;
		this.model=model;
		this.speed=speed;
		
	}
	
	
	public void accelarate(int mph) {
		speed+=mph;
		System.out.println("make" + type +"is accelerating.");
	}
	public  String getType() {
		return type;
		
	}
	
	public void setType(String type) {
		this.type=type;
		
		
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
