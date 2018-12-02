package day_29_arrays06_multiDimension;

import java.util.Arrays;

public class CarsMultiDArray {

	public static void main(String[] args) {
		
              /*
               * create a 2 D ARRAY  called cars
               * in first have  3 geoups of cars
               * 1.Japanese
               * 2.German
               * 3.American
               * 4.Italian 
               */
		
		String[][]  cars= { 
				{ "Honda","Lexus","Toyota","Mazda","Nissan","Subaro"},
				{ "Audi","BMW", " Porche", " VW", "Mersedes benz"},
				{ "Dodge", "Ford", " Tesla", " Jeep", " Chevrolet", " Lincoln"},
				{" Ferrari", " Fiat", " Maserati", "Bugatti", "Lamborghini", "Alfa rameo", "lacia"}
				
		};
		//1. Using for Loop
		//outer loop we loop from 0 - cars.length
		//inner loop -> we loop 0 to cars [index].length. and access cars
		
		for(int i =0; i <cars.length; i++) {
			for(int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j]);
				
			}
		}
		
		
		for(int i =0; i <cars.length; i++) {
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
				
			}
			System.out.println();
		}
		
		//2. Using for each loop: enhanced  for loop
		
		for(String [] carGroups :cars) {
			 for(String car : carGroups) {
				 System.out.print(car + " ");
			 }
			 System.out.println();
		}
		
		
		for(String[] carGroups : cars) {
		 System.out.println(Arrays.toString(carGroups));
			
		}
		System.out.println(Arrays.deepToString(cars));
		
		
		for(int i=0; i<cars.length; i++) {
			switch(i) {
			case 0:
				System.out.println("Japanese: ");
				break;
			case 1:
				System.out.println("German:");
				break;
			case 2:
				System.out.println("American:");
				break;
			case 3:
				System.out.println("Italian");
				break;
				default:
					System.out.println("Unknown group");
			}
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i] [j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
