package day_48_overriding;

import abstraction_intro_interface.Building;

public class SingleHouse  extends Building{
   double hoaFee;
   

@Override
public void addFloor() {
	
	System.out.println("adding door in single house");
}


@Override
public void addDoor() {
	
	
	System.out.println("adding floor for single house");
}


public SingleHouse(String name, String type, int floorCount,double hoaFee ) {
	super(name,type,floorCount);
//	super.setName(name);
//	super.setType(type);
//	super.setFloorCount(floorCount);
//	
	this.hoaFee = hoaFee;
}


@Override
public String toString() {

	return super.toString() +hoaFee + " " + "|SingleHouse";
}

    
   
}
