package day_45_static_blocks_inheritance;

public class BlocksTest {
	static int num=100;
	static String str;
	
	//#1
	static {
		System.out.println("static block");
		num=num+1000;
		str="Hello";
	}
	
	//#2
	{
		System.out.println("Init block");
num=num+500;
str=str+ " world";

	
	}
		
		
	//#3
	public BlocksTest() {
		System.out.println("Constructor");
		num=num *2;
		str = str+ "!!!";
		
		
	}
	

}
