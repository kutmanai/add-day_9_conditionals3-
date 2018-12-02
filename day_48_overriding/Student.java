package day_48_overriding;

public class Student {
	 protected  String name;
	  protected  int studentID;
	
	public Student() {
		System.out.println("no arg from Student");
		
	}
	public Student(String name, int studentID) {
		super();
		//this();
		this.name = name;
		this.studentID = studentID;
	System.out.println("2 arg from"+this.name + " "+this.studentID);
	}
	
	public String getName() {
		return name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void printDetail() {
		System.out.println(name + " " +studentID);
	
	}
	
	
	
	
	

}
