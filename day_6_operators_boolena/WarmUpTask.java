package day_6_operators_boolena;
 import java.util.Scanner;
 
public class WarmUpTask {

	public static void main(String[] args) {
		//Scanner kilo = new Scanner(System.in);
		//System.out.println("Enter mile in kilometr");
		//double mile = kilo.nextInt();
		//double  km = mile * 1.60935;
		//System.out.println(mile + " mile is " +km);
		
		//kilo.close();
		
		Scanner auto =new Scanner(System.in);
		System.out.println("Enter current odometer value");
		
		double current = auto.nextDouble();
		
		System.out.println("Enter previuos odometr value:");
		double previuos =auto.nextDouble();
		
		System.out.println("Enter gallons:");
		double gallons = auto.nextDouble();
		System.out.println("Price per gallon:");
		double pricePerGallon = auto.nextDouble();
		
		double mpg = (current -previuos) / gallons;
		System.out.println("MPG value: " + mpg);

		double totalCost = gallons * pricePerGallon;
		System.out.println("Your total cost is $ " +totalCost);
		
        
		
		
		
	}

}
