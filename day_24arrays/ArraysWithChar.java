package day_24arrays;

public class ArraysWithChar {

	public static void main(String[] args) {
		 // declare a char array and assign A,B,C,D,E to it
		// use any one of 3 ways to do so.
      char[] grade = { 'A','B','C','D', 'E'};
       char[] grades=new char[] { 'A','B','C', 'D', 'E'};
      System.out.println(grade);
      System.out.println(grades[0]);
      char myGrade=grades[1];
      System.out.println(myGrade);
      
      
       //String[]cities=new String[3];
       String[]cities;
       cities=new String[3];
       
       cities[0]="Washingthon";
       cities[1]="Los Angeles";
       cities[2]="New York";
       
       String[] cities2= {"Chicago","Mclean","Miami"};
    		 
      

	}

}
