package day_47accessmodiffier02;

import day_47accesmodiffier01.Student;

public class OnlineStudent  extends Student{
	//name and studentID is accessible since it 's protected
	int webinarID;
   int studentID;
// String name;
	
	public OnlineStudent() {
		super();
		
		System.out.println("no arg from LocalStudent"+name);
		
		//create a constructor that take 3 arguments
		//set the value of name, studentID, webinarID
		
		
	}

	public OnlineStudent(int webinarID, String name, int studentID) {
		
		//super();
//		this.webinarID = webinarID;
//		super.name="SuperName";
		this.webinarID=webinarID;
		this.name=name;
		this.studentID=studentID;
		
		System.out.println("3 arg  from OnlineStudent");
//		System.out.println("name value from super" +super.name);
//		System.out.println("name value from this class"+this.name);
	}
	
	//METHOD OVERRIDING
	//@Override
	public void printDetail() {
		System.out.println(name + " " +studentID +" " +webinarID);
		
	}
	

}
