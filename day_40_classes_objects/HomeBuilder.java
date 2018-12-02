package day_40_classes_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeBuilder {

	public static void main(String[] args) {
		
		Home house = new Home();
		house.bedrooms=3;
		house.type="Townhouse";
		house.address="123 Main st Streling Va 22222";
		house.year=2010;
		
		
		Home house2 = new Home();
		house2.bedrooms=3;
		house2.type="Appartment";
		house2.address="3456 Lee highway Apt 22 ,FairFax 22031";
		house2.year=2014;
		
		
		Home house3 = new Home();
		house3.bedrooms=3;
		house3.type="Condominium";
		house3.address="2234 K st NW Apt 543, Washingthon DC 2000";
		house3.year=2014;
		
		Home whiteHouse = new Home();
		whiteHouse.bedrooms=132;
		whiteHouse.type="Mansion";
		whiteHouse.address="1600 Pensyllvania  ave NW, Washingthon DC";
		whiteHouse.year=1800;
		
		System.out.println(" House types: " + house.type);
		System.out.println(" House types: " + house2.type);
		System.out.println(" House types: " + house3.type);
		System.out.println(" whiteHouse types: " + whiteHouse.type);
		
		
		//String name=" John";
		int [] nums = new int[4];
		nums[0]=234;
		String [] names= new String[4];
		names[0]="Bill";
		
		
		Home EsqerHouse = new Home();
		EsqerHouse.type="TownHouse";
		EsqerHouse.address=" 4321 Jones St,Tyson ";
		EsqerHouse.bedrooms=3;
		EsqerHouse.year=1980;
		
		
		Home[] houses= new Home[5];
		houses[0]=house;
		houses[1]=house2;
		houses[2]=house3;
		houses[3]=whiteHouse;
		houses[4]=EsqerHouse;
		
		System.out.println(houses[0].address);
		for(Home h:houses) {
			System.out.println( h.type+ " ->" +h.address);
		}
		
		for(int i=0; i<houses.length; i++) {
			System.out.println( houses[i].type+ " ->" +houses[i].address);
			
		}
		
		
		System.out.println("======ARRAYLIST OF HOUSE OBJECTS------");
		ArrayList<Integer>numsList = new ArrayList<>();
		ArrayList<Home> housesList= new ArrayList<>();
		housesList.add(house);
		housesList.add(house2);
		housesList.add(house3);
		housesList.add(whiteHouse);
		housesList.add(EsqerHouse);
		
		ArrayList<Home> housesList2= new ArrayList<>(Arrays.asList(houses));
		List<Home> housesList3= Arrays.asList(houses); //fix size arraylist you can add another house
		//print year of each object in arrayList if year  is between 2006 and 2016
			System.out.println();
			
			for(Home home:housesList) {
				int year= home.year;
				if(year>=2006 && year <=2016) {
					System.out.println(year+ " |" + house.address);
					
				}
				
				//another valid way of doing the same;
				for(int j=0; j<housesList.size(); j++) {
					Home tempHouse =housesList.get(j);
					 if(tempHouse.year>=2006 && tempHouse.year<=2016) {
						 System.out.println(tempHouse.year + "|" +tempHouse.address);
					 }
				}
				
			}
			
			
			
		
	}
	public static  void printHomeInfo(Home house) {
		System.out.println("============");
		System.out.println("Type :" +house.type);
		System.out.println(" Address: " + house.address);
		System.out.println(" Bedrooms #: " + house.bedrooms);
		System.out.println("Year:" + house.year);
		System.out.println(" =================");
		
		
	}
	

}
