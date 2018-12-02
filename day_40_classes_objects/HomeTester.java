package day_40_classes_objects;

public class HomeTester {

	public static void main(String[] args) {
		//Step 1. Create House object and assign data to field / int varaiables
		
		Home yourHouse= new Home();
		yourHouse.type="Castle";
		yourHouse.address="100 Massachusets ave , Washingthon Dc 22001";
		yourHouse.year=2018;
		
		//Step 2. Pass your house object tool printHouseInfo method
		printHomeInfo(yourHouse);
		
		//Create one more object of House and pass it to method
		
		Home yourHouse1= new Home();
		yourHouse1.type=" Classic";
		yourHouse1.address="8710 W  Summerdale ave apt 1N";
		yourHouse1.year=1990;
		
		printHomeInfo(yourHouse1);
		
		
		Home returnHouse=buildAHouse("Loft","777 Wooden Spoon lane NY 11230", 2,1999);
		System.out.println(returnHouse.address);
		//System.out.println(returnHouse.bedrooms);
		printHomeInfo(returnHouse);
		
		
		

	}
	public static  void printHomeInfo(Home house) {
		System.out.println("============");
		System.out.println("Type :" +house.type);
		System.out.println(" Address: " + house.address);
		System.out.println(" Bedrooms #: " + house.bedrooms);
		System.out.println("Year:" + house.year);
		System.out.println(" =================");
		
		
	}
	
	//Create a method buidAHouse:
	/*
	 * Params: 4
	 * return type :House
	 * in the method , using the valuse of the parameters buid a new House object
	 * then return that
	 * 
	 */
	
	public static  Home buildAHouse(String type , String address, int rooms , int year  ) {

	
	Home  newHouse = new Home();
	newHouse.type=type;
	newHouse.address=address;
	newHouse.bedrooms=rooms;
	newHouse.year=year;
	
	return newHouse;
	}
	
}
