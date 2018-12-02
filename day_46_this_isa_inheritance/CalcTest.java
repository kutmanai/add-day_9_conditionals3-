package day_46_this_isa_inheritance;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c= new Calc();
		c.plus(10);
		System.out.println(c.getResult());
		c.plus(5).plus(15).plus(10).plus(3).minus(3);
		System.out.println(c.getResult());
		
		

	}

}
