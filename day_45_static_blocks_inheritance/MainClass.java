package day_45_static_blocks_inheritance;

public class MainClass {
	public static void main(String[] args) {
		ClassWithStaticBlock zero;
		ClassWithStaticBlock.staticMethod();;
		ClassWithStaticBlock.staticMethod();
		
		ClassWithStaticBlock one = new ClassWithStaticBlock();
		ClassWithStaticBlock two = new ClassWithStaticBlock();
		ClassWithStaticBlock three = new ClassWithStaticBlock();
	}

}
