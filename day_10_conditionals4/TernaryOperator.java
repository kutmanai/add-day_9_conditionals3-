package day_10_conditionals4;

public class TernaryOperator {

	public static void main(String[] args) {
		int score=70;
			
		String status;
		
		if (score>=60) {
			status ="pass";
		}else  if (score<=60 ) {
			status ="fail";
		}
		status =(score>=60)? "pass" :
			"faill";
		System.out.println(status);
		

		 boolean express=true;
		 
		 
	System.out.println((express) ? 25 : 15);
	int shipping =(express == true) ? 25: 15;
	System.out.println( " $" +shipping);
			
	}

}
