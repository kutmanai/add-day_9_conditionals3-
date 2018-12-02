package day_40_classes_objects;

public class ModelOfComputer {

	public static void main(String[] args) {
		Computer comp1= new Computer();
		comp1.model=" MacBook Air";
		comp1.color="Silver";
		comp1.memory=256;
		comp1.size=16;
		comp1.condition=true;
		
		comp1.turnOn();	
		comp1.turnOff();
		
		
		Computer c2= new Computer();
		c2.model=" Dell";
		c2.turnOff();
	}

}
