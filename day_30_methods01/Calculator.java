package day_30_methods01;

public class Calculator {

	public static void main(String[] args) {
		
		
		String name="James";
		
		 int k= add(43,23);
		 System.out.println(" Just to make sure:" +k);
		

		
	}
	
	public static int add (int i, int j) {
		int sum =i +j;
		
		System.out.println("Sum is:" +sum);
		return sum;
	}

}
