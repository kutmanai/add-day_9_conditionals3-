package day_17_reviewsession2;

public class String01 {

	public static void main(String[] args) {
		String greeting="Hello World!";
		System.out.println(greeting.length());
		int len =greeting.length();
		System.out.println("Length:" +len);
	
	    System.out.println(greeting.charAt(0));
		char firstCh=greeting.charAt(0);
		System.out.println("First char:" +firstCh) ;

		System.out.println(greeting.charAt(11));
		
		System.out.println(greeting.charAt(len));
		System.out.println(greeting.charAt(len-1));
		  greeting = greeting +"I hope everyone is well";
		char lastCh=greeting.charAt(greeting.length()-1);
		System.out.println("Last char:" +lastCh);
		

	}

}
