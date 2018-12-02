package day_34_method_overloading;

public class Calculator {

	public static void main(String[] args) {
		 byte b=32;
		 char a='A';
 add(a);

	}
	public static void add(int s) {
		System.out.println("Int:" +s);
	}
	public static void add( double i) {
		System.out.println("Int : " + i);
	}
//	public static void add(long l) {
//		System.out.println("Long: " + l);
//	}
//	public static void add( int l) {
//		System.out.println("Int : " + l);
//	}
//	
	

}
