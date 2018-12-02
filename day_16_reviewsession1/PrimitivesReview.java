package day_16_reviewsession1;

public class PrimitivesReview {
	/* Data Types in Jva
	 * 1)
	 * primitives
	 * 2) objects/class types/ non-primitive
	 * 
	 * 
	 * Primitives:
	 * Whole Number/Integer:
	 * byte>short>int>long
	 * Floating point numbers/Numbers with Decimals:
	 * float>double
	 * Character type
	 * char
	 * Boolean can be true or false.
	 * 
	 * 
	 */
	   public static void main(String[] args) {
		   
	   
	 byte chairs =70;
	 byte secondRoomChairs= 50;
	 
	 // first room has __cahirs and second room has __ chairs__
	 // there are __cahirs more in first room
	 System.out.println("First room has " + chairs +"chairs and second room has" + secondRoomChairs
			 + "chairs\n" +
			  "there are " +(chairs-secondRoomChairs) +" more in first room");
	 short shortValue =32000;
	 System.out.println("Short value " + shortValue);
	 int intValue =shortValue; // small can fit into large type. Implicit/Automatic casting
	 System.out.println(intValue);
	 intValue=intValue*100;//3200000
	 shortValue=(short)intValue; // explicit casting/ converting
	 System.out.println("Short after casting " + shortValue);
	   int cityPopulation=200_0000_000; // underscore are allowed so that we can read easier.
	   // compiler will ignore those;
	   // your number can not start or end underscore.
	   System.out.println(cityPopulation);
	    long worldPopulation=8000_000_000L;
	    System.out.println( " Current world population according to Cybertek java students " +worldPopulation);
	    
	    
	    short shortNum=500;
	    byte  byteNum=(byte)shortNum;
	    
	    System.out.println(byteNum);
	    double price =45.33, discount =12.5;
	    double total =price=discount;
	    
	    System.out.println(price);
	    System.out.println(discount);
	    System.out.println(total);
	 
	   }

}
