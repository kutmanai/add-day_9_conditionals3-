package day_30_methods01;

import day_31_method02.Calculator1;

public class Method_Introduction {

	public static void main(String[] args) {
			
		
           sayHello(); //calling sayHello Method
           sayHello( );
           sayBye();
           askHowRu();
           reply();
           System.out.println(" I am doing  great! thanks");
           sayBye1();
           sayHello2(" Trump");
           String nameofOnlineFriend="Umit";
           sayHello2(nameofOnlineFriend);
           //sayHello2(100); will not work;
           sayHello2("100");
           Calculator1.multiply(34,25);
           
	}
	public static void  sayHello() {
		System.out.println("Hello");
		System.out.println("Hi");
		
	}
	
	public static void  sayHello2( String name) {
		System.out.println(" Hello" + name);
	}
	public static void sayBye() {
		System.out.println("Bye!,Have a good day!");
	}
	
	/* write a method askHowareYou that asks "how are you doing?"
	 * 
	 *  write a method reply that prints " i am doing well , how about you?
	 *  
	 *  
	 *  Write a method sayBye, that says "Bye! Have a good day!"
	 *  
	 */
	
	 public static void askHowRu() {
		 System.out.println("How are you doing?");
	 }
	 public static void reply() {
		 System.out.println("I am doing well, how about you?");
	 }
	 public static void sayBye1() {
		 System.out.println(" Bye!, Have a good day!");
	 }

}
