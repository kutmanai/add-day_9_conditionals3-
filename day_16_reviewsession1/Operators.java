package day_16_reviewsession1;

public class Operators {

	public static void main(String[] args) {
		/* first one is arithmetic operators: +,-,/,*,%
		 * short hand assignment +=,-=,/=,*=,%=
		 * increment/decrement :--,++
		 * comparison:>,>=,<,<=,==,!=
		 */
		 
		
		/* distance , pace
		 * How many minutes it will take to reach destination?
		 * 
		 * 
		 */
		 double distanceInMile=34;
		 double pace=20 ;
		 double minutes =distanceInMile/pace * 60;
		 System.out.println(" Minutes to reach destination" + minutes);
		 //you spend 5 minutes in traffic
		 minutes+=5.0;
		 // you spent 1 minute extra because you took a wrong turn
		 minutes++;
		 
		 System.out.println("Finally it takes:" +minutes + "minutes");
		 
		 int number =10;
		 System.out.println(number/3);//3
		 System.out.println(number %3);//1
		 ++number;//add 1
		 System.out.println(number);
		  
		 number++;//add 1
		 System.out.println(number);
		 int num2=++number;
		 System.out.println(num2);
		 System.out.println(number);
		 
		 num2=number++ + ++number; 
		 System.out.println(num2); //28
		 System.out.println(number);//15
		
		 
		 

	}

}
