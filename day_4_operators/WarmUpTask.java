package day_4_operators;

public class WarmUpTask {

	public static void main(String[] args) {
		
		int eggs =20;
		int cupOfFlour =1;
		double cupOfMilk =0.5;
		byte  spoonOfshugar =2;
		short  spoonOfoil =2;

		//System.out.println("You need  " +  eggs +  " eggs "  + "and" +cupOfFlour  +    " cupOfFlour " + "and " +cupOfMilk  + "cupOfMilk" + "and" + spoonOfshugar + "spoonOfoil");
		System.out.print("You need  "  + cupOfFlour  + " cupOfFlour ");
		System.out.print("You need  " + cupOfMilk  + " cupOfMilk ");
		System.out.print("You need  " + spoonOfshugar  + " cupOfshugar ");
		System.out.print("You need  " + spoonOfoil  + " spoonOfoil ");
		
		double apples = 10.55;
		double carrots =3.87;
		double tomatoes=6.23;
		
		double totalBeforeTax =apples+carrots+tomatoes;
		System.out.println("Total Before Tax :" + totalBeforeTax );
		double tax =totalBeforeTax * 0.06;
		System.out.println("Total tax " +tax);
		
		double grandTotal =totalBeforeTax +tax;
		System.out.println("Your Total is $" +grandTotal);
		
		
	}
	
}


