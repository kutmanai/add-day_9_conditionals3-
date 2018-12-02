package reviewloops;

public class AssignmentOperator {

	public static void main(String[] args) {
		 // Assignment
		  int studentCount=150;
		  studentCount=studentCount + 1;

		  //Compound Assignment operator +=,-=,*=,\=,%=
		  studentCount=studentCount +5;
		 studentCount+=5; //it is shortcut top
		  System.out.println(studentCount);
		  
		  studentCount-=2;
		  System.out.println(studentCount);
		  studentCount *=2;
		  studentCount /=2;
		  System.out.println(studentCount);
		  
		  //Unary operators
		  //increment decrement
		  studentCount++; //studentCount=studentCount +1;
		  System.out.println(studentCount++);
		  System.out.println(studentCount);
		  System.out.println(++studentCount);
		  //pre decrement and post dercement
		  studentCount --;
		  System.out.println( "post decrement"+studentCount--);
		  System.out.println( "after post decrement" +studentCount);
		  System.out.println("pre decrement" + --studentCount);
		  
		 // studentCount=studentCount++ + --studentCount +5;
		  //studentCount=158 +159 +5;
		  studentCount= -studentCount ; // it will print -158;
		  //binary Arithmentic Opertator : + , -, *, /, %
		  int i =100,  j=3;
		  double d =3d;
		  double a= i/j;
		  double b=i/d;
		  
		  System.out.println(a);
		  System.out.println(d);
		  //automatic promotion to int  while doing arithmatic opeartion on
		  //data type has lower range than it
		  // Casting
		   byte b1=12, b2=13;
		    byte b3=(byte)(b1+b2);
		    
		    int i1=100; long i2;
		    
		    i2=i1;
		    i1= (int)i2; // be careful , bear shouldn't injest large fluffy dog 
		    //             boolean, char ,byte ,short,  int,   long, float, double
		    
		    //Relational Operator
		    
		    boolean  bool=studentCount>100; 
		    // !
		    System.out.println( !bool);
		    System.out.println(studentCount !=158);
		    
		    //Logical Operator &,^, !
		    
		    System.out.println(("true & true--") + (true& true));
		    System.out.println("true & false--" + (true & true));
		    System.out.println("false & true--" + (false & true));
		    System.out.println("false & false --" + (false & false));
		     System.out.println();
		    // |
		    System.out.println("true ^ true---" +(true ^ true));
		    System.out.println("true ^ false--" + (true^ true));
		    System.out.println("false ^ true--" + (false ^ true));
		    System.out.println("false ^ false--" + (false ^ false));
		    
		    System.out.println();
		  
	     // | 
		    
		    System.out.println("true | true---" +(true ^ true));
		    System.out.println("true | false--" + (true^ true));
		    System.out.println("false | true--" + (false ^ true));
		    System.out.println("false | false--" + (false ^ false));
		    
		    boolean day =true, nigth =false;
		    if(day^nigth) {
		    
		    System.out.println( " you are not dreaming");
		    
		    }else {
		    	System.out.println("day and nignt can not happen at the same  time");
		    }
		    
		    // ternary Operator
		    
		    // String  message=(day^nigth) ?  " you are not dreaming"
		     
	}

}
