package day_9_conditionals3;
 import java.util.Scanner;
public class CreditScore {

	public static void main(String[] args) {
		
		Scanner  scan =new Scanner (System.in);
		System.out.println(" FICO CREDIT SCORE CHART ");
		System.out.println(" Enter your credit score ");
		int creditScore =scan.nextInt();
		String creditStatus ="";
		int percentege =0;
		
		if (creditScore>=300 && creditScore <=579) {
			creditStatus ="Very Poor";
			percentege= 16;
		} else if (creditScore >=580 && creditScore <=669) {
			creditStatus="Fair";
			percentege =18;
			
		} else if (creditScore >=670 && creditScore<=739) {
			creditStatus="Good";
			percentege= 21;
			
		} else if (creditScore >=740 && creditScore<=799) {
			creditStatus="Very Good";
			percentege= 25;
			
		} else if (creditScore >=800 && creditScore <=850) {
			creditStatus ="Exceptional";
			percentege= 20;
			
			
			
		}  else if(creditScore >=0 && creditScore <=850)   { 
			creditStatus =" Invalid Credit score.Can  not be negative por more than 850";
		  percentege=0;
		}
		else  {
			System.out.println(" You have a  bad credit history");
			
		}
		System.out.println("Your credit score is " + creditStatus + " and " + percentege + " percentege ");
		
	}  

}
