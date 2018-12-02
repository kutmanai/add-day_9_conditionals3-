package practice;

import java.util.ArrayList;

public class VechicleofOwner {

	public static void main(String[] args) {
		
		 
		  Vehicle hatchback = new Vehicle();
		  hatchback.year=1994;
		  hatchback.brand="Subaru";
		  hatchback.model="Legacy";
		  hatchback.miles=170000;
		  hatchback.price=4000;
		  
		  Vehicle suv = new Vehicle();
		  suv.year=2000;
		  suv.brand="Audi";
		  suv.model="A4";
		  suv .miles=46677878;
		  suv .price=34455;
		  
		  Vehicle sedan = new Vehicle();
		  sedan.year=2010;
		  sedan.brand="Toyota";
		  sedan.model="SE";
		  sedan.price=34566;
		  sedan.miles=78990;
		  
		  Vehicle truck = new Vehicle();
		  truck.year=2012;
		  truck.brand="Volva";
		  truck.model="legacy";
		  truck.miles=123455;
		  truck.price=456789;
		  
		  System.out.println("All Vehicle in the lot");
		  
		 
		     Vehicle[] vehicleArr= {hatchback,suv, sedan, truck};
		     for(int i=0;i<vehicleArr.length;i++) {
		    	 System.out.println("===================");
		    	 System.out.println(" Brand:" + vehicleArr[i].brand);
		    	 System.out.println("Model:" + vehicleArr[i].model);
		      System.out.println("Miles:" + vehicleArr[i].miles);
		     System.out.println("Price:" + vehicleArr[i].price);
		     System.out.println("Year:" + vehicleArr[i].year);
		 
	}

}

}