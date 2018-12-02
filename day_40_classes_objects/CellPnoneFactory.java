package day_40_classes_objects;

public class CellPnoneFactory {

	public static void main(String[] args) {
		//creating object from a cellphone class
		CellPhone  phone1= new CellPhone();
		phone1.brand="Apple iphone XS";
		phone1.color="Piano Black";
		phone1.price=999.0;
		
		phone1.call();
		phone1.text();
		//create 2 cellphone objects
		CellPhone phone2 = new CellPhone();
		CellPhone phone3 = new CellPhone();
		//assign value to object variables
		phone2.brand="Ericson";
		phone2.color="Black";
		phone2.price=30.5;
		
		phone3.brand="HTC EVO";
		phone3.color="Black";
		phone3.price=350.5;
		//call object methods
		phone2.call();
		phone2.text();
		
		System.out.println(phone1.brand);
		System.out.println(phone2.brand);
		System.out.println("phone3 brand-"+ phone3.brand);
		
		
		//calculate total price for all 3 phones
		
		double total=phone1.price+phone2.price+phone3.price;
		System.out.println("Total for all 3 phones "+total);
		 // can we update object value ?
		
		phone1.price=1200.0;
		phone2.price=phone3.price;
		System.out.println("phone1 price"+phone1.price);
		
		System.out.println("phone2 price"+phone2.price);
		System.out.println("phone3 price"+phone3.price);
		
	//	CellPhone.call(); will not work since call is not static
		
	
		
		
		
	}

}
