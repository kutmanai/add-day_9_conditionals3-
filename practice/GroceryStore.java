package practice;

public class GroceryStore {

	public static void main(String[] args) {
		
		Apple apple1= new Apple( 1,"red", "sweet", "big");
		
		Apple apple2= new Apple(2,"green", "sweet", " big");
		Apple apple3= new Apple(3,"green","tastylemon", "small");
		
		Apple[] appleArr = {apple1,apple2,apple3};
		System.out.println("Your apple specs");
		for(int i=0; i<appleArr.length; i++) {
			System.out.println("================");
			
			System.out.println("Weight:" +appleArr[i].weight);
			System.out.println("Color:" +appleArr[i].color);
			System.out.println("Taste:" +appleArr[i].taste);
			System.out.println("Size:" +appleArr[i].size);
		}

	} 

}
