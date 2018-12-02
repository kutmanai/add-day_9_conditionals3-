package day_48_overriding;

public class Latin extends Language {
	public static void main(String[] args) {
		Latin latin = new Latin();
		latin.firstAlphabet='A'; //public
	     latin.prononciation="good"; //protected
	     latin.numberOfUser=800000000000L; //DEFAULT
	     
	     
	}


}
