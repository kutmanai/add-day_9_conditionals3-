package day_32_methodreview;

import java.util.Arrays;
import java.util.Random;

import day_30_methods01.Calculator;

public class ReturnMethod {

	public static void main(String[] args) {
		    Calculator.add(20, 30);
		    
		    int i=getRandomBtwOneToHundred();
		     
		//method parameter, arguments
		//We can declare as many parameters as we want in java custom method creation.
		//Also we have option not to pass any parameter.
		//A method that does not take any argument.
		
		 
		
	}
	
	/** This method calls javaDoc
	 * This method returns number between 0 to 100
	 * 
	 * @return
	 */
	public static int getRandomBtwOneToHundred() {
		Random random=new Random();
		return random.nextInt(100);
		
	}
	/**
	 * 
	 * @param name
	 * @return
	 */
	public static int getAge(String name) {
		if(name.equals("James")) {
			return 34;
		}
		else {
			return 55;
		}
		
	}

}
