package day_16_reviewsession1;

public class Budget {

	public static void main(String[] args) {
		 double  budget=250.0;
		  
		  
		  double phone=250.0;
		  double watch=105.5;
		  double bag =80.0;
		  if (budget >=435 && budget <=435) {
			 
			  
			  System.out.println("You can buy anything");
			
		  } else  if (budget>=phone + watch){
		
			  System.out.println("You can  buy watch and bag");
		  } else if (budget >=phone+bag) {
			  System.out.println("You can buy phone and bag");
		  } else if (budget >=watch +bag) {
			  System.out.println("you can buy watch and bag");
		  } else {
			  System.out.println("you can not buy anything");
		  }
		  

	}

}
