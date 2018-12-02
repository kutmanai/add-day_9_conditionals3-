package day_45_static_blocks_inheritance;

public class BlocksTest1 {

	public static void main(String[] args) {
//		System.out.println(BlocksTest.num);
//		System.out.println(BlocksTest.str);
//		
		System.out.println(BlocksTest.num);//1100
		System.out.println(BlocksTest.str);//Hello
		
		
		
		BlocksTest b1= new BlocksTest();
		BlocksTest b2= new BlocksTest();
		
		System.out.println(b1.num);//3200
		System.out.println(b1.str);//Hello world
		
		System.out.println(b2.num);//7400
		System.out.println(b2.str);//Hello world!!!
		
		
		
		
	}

}
