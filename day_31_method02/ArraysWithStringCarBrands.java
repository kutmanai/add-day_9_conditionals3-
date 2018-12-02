package day_31_method02;

public class ArraysWithStringCarBrands {

	public static void main(String[] args) {
		
		 String[] cars= {"mersedes","bmw","toyota","ferari"};
//		 String  brands="";
//		 
//		   switch(brands) {
//		   case  "mersedes":
//			   System.out.println("Luxury Comfort");
//			   break;
//		   case "bwm":
//			   System.out.println("Luxury Sport");
//			   break;
//		   case "toyota":
//			   System.out.println("Reliable-Cheap");
//			   break;
//		   case "ferari":
//			   System.out.println(" Super car super expensive");
//			   default:
//				   System.out.println("Wrong  Car Brands");
		 
//				   break;
		 
		 
		 
		for(int i=0; i<cars.length; i++) {
			if(cars[i]=="mersedes") {
				System.out.println(cars[i] + " :Luxury-Comfort");
			}else if(cars[i]=="bmw") {
				System.out.println(cars[i]+ ":Luxury-Sport");
			}else if(cars[i]=="toyota") {
				System.out.println(cars[i] + "Leliable-Cheap");
			}else  {
				System.out.println(cars[i] + " :Super car super expensive");
			}
		}
				   
			   
			   
		   
		   }

	}


