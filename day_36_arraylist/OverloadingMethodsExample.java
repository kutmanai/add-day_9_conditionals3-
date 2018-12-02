package day_36_arraylist;

public class OverloadingMethodsExample {

	public static void main(String[] args) {
		/*
		 *  2 methods: add
		 *  1st: add
		 *  parametrs: 2 ints
		 *  return int
		 *  
		 *  2nd: add parameters 3 doubles
		 *  return double;
		 * 
		 */
		
		System.out.println( add(100,400));
		System.out.println( add(100,400,500));
		System.out.println( playGame(" ping pong",4));
		System.out.println( playGame(6," ping pong"));




	}
	 public static int add(int num1, int num2) {
		 return num1 +num2;
		 
	 }
	 public static double add(double num, double num3, double num4) {
		 return num+num3+num4;
	 }
	 
	 /*
	  * 
	  * playGame method :
	  * 1.Name: playgame
	  * paramterters: int , string
	  * return boolean
	  * 2.name:playgame
	  * param:string ,int
	  * return boolen.
	  * gamename , numberofplayers >= 2 then return true.
	  * print playing[game] with [that many] players
	  * 
	  */
	 
	  public static boolean playGame(String  name, int playeres) {
		  System.out.println("Playing " + name + " with" + playeres +" playeres");
		  
		  return  playeres >=2;
	  }
	  public static boolean playGame(int playeres,String name) {
		   
System.out.println("Playing " + name + " with" + playeres +" playeres");
		  
		  return  playeres >=2;
	  }
	  
	  /*
	   *Method: work
	   *1. param:string. job type
	   *returns boolean;
	   if job is sdet or develeopers , then true , else false
	   print working as Job type and is fun
	   2.param: int hours
	   return double -> salary  * hours*60
	   
	   *  print : Worked<this many> hours and made that much income
	   *  
	   */
	  
	   public static boolean work(String jobType) {
		   System.out.println("Working as <" + jobType+"> and it is fun!");
		   
		   return jobType.equalsIgnoreCase("sdet") || jobType.equalsIgnoreCase("developer");
		   
		   
		   //System.out.println();
		   
	   }
	    public static double work(int hours) {
	    	double salary=hours*60;
	    	System.out.println("Worked <" + hours+ "> and made $ < that much income");
	    	return salary;
	    }
	  

}
