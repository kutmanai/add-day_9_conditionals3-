package day_40_classes_objects;

public class Home2 {

	

	public static void main(String[] args) 
	{
		
		House  home1= new House ();
		home1.type=" Clasic style";
		home1. address= " 8710 w Summerdale ave" ;
		home1.numRooms=1;
		
		
		   House home2= new House();
		   home2.type="TownHouse";
		   home2.address="4545 adam ave";
		   home2.numRooms=4;
		   
		   System.out.println(home1.type);
		   System.out.println(home2.type);
	

}
}
