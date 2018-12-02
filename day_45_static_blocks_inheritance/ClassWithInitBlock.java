package day_45_static_blocks_inheritance;

public class ClassWithInitBlock {
	
	static {
		System.out.println("Static block, i run one time before Init and Constractor . But one time");
	}
	{
		System.out.println("This is Initializer block. I run automaticaly evert time object is created");
	}
	public ClassWithInitBlock() {
		System.out.println("This is a Constractor. I run every time ibject is created");
	}
	public static void staticMethod() {
		 System.out.println("This is static method");
	}

}
