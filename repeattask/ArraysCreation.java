package repeattask;

public class ArraysCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring array that can hold 5 items
		 int [] numbers = new int[5];
		 //assign values
		 //0,1,2,3,4
		 numbers[0]=100;
		 numbers[1]=200;
		 numbers[2]=300;
		 numbers[3]=400;
		 numbers[4]=500;
		 
		 //read from array
		 System.out.println(numbers[0]);
		 System.out.println(numbers[3]);
		 
		 numbers[0]=1000;
		 System.out.println(numbers[0]);
		 //numbers[10]=34555;  index of out bound exception
		  numbers[1]=numbers[2]+numbers[3];
		  System.out.println(numbers[1]);
		  
		  //declare a char array grades and assign A,B,C,D,F, to it
		  //use one of 3 ways
		   char [] grades= {'A','B','C','D','E'};
		   char [] grades2=new char[]{'A','B','C','D','E'};
		   //print first item
		   System.out.println(grades[0]);
		   char myGrade=grades[1];
		   System.out.println(myGrade);
		   
		   String [] cities = new String[3];
		     cities[0]="Washingthon";
		     cities[1]="Los Angeles";
		     cities[2]="New York";
		  
		 
		 
	}

}
