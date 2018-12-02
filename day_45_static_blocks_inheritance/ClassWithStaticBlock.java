package day_45_static_blocks_inheritance;

public class ClassWithStaticBlock {

	
	
	 static {
		 System.out.println("This is static Block, i run onlu in the begining");
	 }
	 
	 public  ClassWithStaticBlock() {
		 System.out.println("This is a Constractor. I run every time ibject is created");
	 }
	 
	 public static void staticMethod() {
		 System.out.println("This is static method");
	 }
}
