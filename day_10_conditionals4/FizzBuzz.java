package day_10_conditionals4;

public class FizzBuzz {

	public static void main(String[] args) {
		
		System.out.println(" Find a Fizz and Buzz");
		int buzz=40;
		
		if (buzz%3 ==0 && buzz %5==0) {
			System.out.println("Print FrizzBuzz");
			
		}else if(buzz %3==0) {
			System.out.println(" Fizz");
		} else  if (buzz %5==0) {
			System.out.println(" Buzz");
			
		}else {
			System.out.println(buzz);
		}
		
	}

}
