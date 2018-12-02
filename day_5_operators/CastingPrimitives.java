package day_5_operators;

public class CastingPrimitives {

	public static void main(String[] args) {
		int i =100;
		byte b = (byte)i;
		
		double price =12.5;
		int price2 = (int)price;
		
		System.out.println(price2);
		
		int price1 =13;
		double price3 =(double)price1;
		
		short n1 =30;
		float n2 =(float)n1;
		
		System.out.println(n2);
		
		
		float m1 =15.5f;
		short m2=(short)m1;
		System.out.println(m2);
		
		
		int count =36657;
		double doublecount=count;
		System.out.println(doublecount);
		
		byte bytevalue =127;
		 int intvalue = (int)bytevalue;
		 System.out.println(intvalue);
		
		 //ecplicit casting
		 
		 int students =70;
		 byte byteStudents=(byte)students;
		 System.out.println(byteStudents);
		 //int to byte var
		 
		 double priceofSmth=5343.23;
		 int intPrice=(int)priceofSmth;
		 System.out.println(intPrice);
		 
		 
		 String numStr ="2345";
		 System.out.println(numStr + 5 + 2);
		 
		 System.out.println(5 / 2.0);
		 int x =(int)(5/2.0);
		 System.out.println(x);
		 
		 
		
		
	}

}
