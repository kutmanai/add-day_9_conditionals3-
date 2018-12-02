package day_5_operators;

public class ShortHandOperators {

	public static void main(String[] args) {
		int count = 100;
		count =count +1;
		System.out.println(count);
		
	
	count =count+10;
		System.out.println(count);
		count +=10;
		System.out.println(count);
		
		count =15;
		count *=2;
		count =count *2;
		System.out.println(count);
		count /=5;
		System.out.println("after /=" + count);
		
		count %=5;
		System.out.println(count);
		double price =14.4;
		price /=2;
		System.out.println(price);
		
		int apples =5;
		apples =apples +10;
		System.out.println(" Apples are"+ apples);
		
		int carsInlot=23;
		carsInlot -=10;
		System.out.println(carsInlot + " cars in parking lot");
		
	 double pizzaSlices=12;
		pizzaSlices /=5;
		System.out.println(" Each person gets" + pizzaSlices);
		
		
		int minutes =100;
	int hours =minutes /60;
	System.out.println( " Hours " +  hours);
	
		minutes %=60;
		System.out.println( " Remaining minutes " + minutes);
		


}
	
}

