package day_48_overriding;

public class UseLanguage {

	public static void main(String[] args) {
		
		Language english = new Language("en","US",26);
		System.out.println("Region " +english.getRegion());
		english.setRegion("UK");
		System.out.println("Region " +english.getRegion());
		//make field numberofLetters immutable;
		
		//public --?everyWhere
		//private-->same class
		//default-->only in the same package-->package private
		//protected --> same package + in sub classes in other package
		

	}

}
