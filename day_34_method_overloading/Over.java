package day_34_method_overloading;

public class Over {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		String name="James";
		name.substring(2,4);
		add(45,23);
		
		

	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sayHello(int a, int b, int c) {
		return a+b+c;
	}

}
