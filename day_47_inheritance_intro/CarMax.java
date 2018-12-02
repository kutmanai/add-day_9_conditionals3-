package day_47_inheritance_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarMax {

	public static void main(String[] args) {
		 
		//create object of Vehicle class
		//instantiation of Vehicle class
		
		Vehicle  c1= new Vehicle();
		c1.makeAndModel="Subaru Outback";
		c1.year=2018;
		c1.maxSpeed=140;
		c1.drive();
		c1.stop();
		
		// Instantiate Car Class
		
		Car car = new Car();
		car.makeAndModel="Toyota Prius";
		car.year=2015;
		car.maxSpeed=120;
		
		car.drive();
		car.stop();
		// carMax --> main method is here there is no inheritance relation  between carMax and Vehicle 
		
//		c1.hoursePower=123; will not work  in main class  because  is in child class of Car .
//		c1.doUber();
//		
		 car.doUber();
		 car.hoursePower=234;
		 
		 System.out.println("===Train==");
		 Train t1= new Train();
		 t1.makeAndModel="CyberTrain 10";
		 t1.year=2019;
		 t1.ticketPrice=120.50;
		 t1.maxSpeed=200;
		 t1.drive();
		 t1.stop();
		 
		 
		 System.out.println("=====ELECTRICCAR==========");
		 Car tesla= new  Car();
		 tesla.makeAndModel="Tesla Model-S";
		 tesla.year=2015;
		 tesla.maxSpeed=200;
		 tesla.hoursePower=518;
		 tesla.milleage=54321;
		 
		 
		 tesla.doUber();
		 tesla.charge();
		 tesla.doUber();
		 tesla.stop();
		 System.out.println("Has Battery?" +ElectricCar.hasBattery);
		 
		 System.out.println("====static service call======");
		 Vehicle.service();
		 Car.service();
		 Train.service();
		 ElectricCar.service();
		 
		 WebDriver driver= new ChromeDriver();
		 
		 
		 
		 
		 
		 
		 
	}

}
