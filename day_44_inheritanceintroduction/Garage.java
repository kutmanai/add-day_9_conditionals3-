package day_44_inheritanceintroduction;

public class Garage {

	public static void main(String[] args) {
		Vehicle vehicle1= new Vehicle();
		vehicle1.drive();
		vehicle1.stop();
		//vehicle1.make="BMW";

		
		Car car1= new Car();
		car1.drive();
		car1.stop();
		car1.accellerate();
		//car1.make="Ford";
		
		Bus bus = new Bus();
		bus.drive();
		bus.stop();
		
		SportsCar spCar = new SportsCar();
		spCar.drive();
		spCar.stop();
		//spCar.accellerate();
		
		
	}

}
