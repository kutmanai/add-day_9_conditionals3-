package day_41_constructors;

public class CaeMax {

	public static void main(String[] args) {
		Vehicle car1 = new Vehicle();
		car1.setModel("ILX");
		car1.setType("Sedan");
		car1.setSpeed(35);
		
		System.out.println(car1.getModel());
		System.out.println(car1.getSpeed());
		System.out.println(car1.getType());
		
		car1.accelarate(30);
		System.out.println("Current speed is" + car1.getSpeed());
		
	Vehicle car2 = new Vehicle();
	
//	car2.setModel("hs250");
//	car2.setType("lexus");
//	car2.setSpeed(35);
	
	System.out.println("Car 2 make:" +car2.getModel());
	System.out.println("Car 2 make:" +car2.getType());
	System.out.println("Car 2 make:" +car2.getSpeed());
	
	Vehicle car3 = new Vehicle( "Coupe", "Mustang",40);
	System.out.println();
	System.out.println("Car 3 make:" +car3.getModel());
	System.out.println("Car 3 make:" +car3.getType());
	System.out.println("Car 23make:" +car3.getSpeed());
	
	}

}
