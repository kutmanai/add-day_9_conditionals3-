package day_40_classes_objects;

public class MovieTester {

	public static void main(String[] args) {
		// create 3 movies
		
		Movie internship=  new Movie();
		Movie glatiator = new Movie();
		Movie starWars = new Movie();
		//print null because we did assign name yet
		System.out.println(internship.name);
		System.out.println(internship.length);//0
		
		internship.name="Internship";
		glatiator.name="Galdiator";
		starWars.name="StarWars";
		
		
		
		internship.length=119;
		glatiator.length=140;
		starWars.length=150;

		
		internship.watch();
		glatiator.watch();
		starWars.watch();
		
		internship.buy(10.77);
		glatiator.buy(14.9);
		starWars.buy(22.0);
		
		
		
		
		
	}

}
