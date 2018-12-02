package day_47accessmodiffier02;

import day_47accesmodiffier01.Student;

public class OtherPackage {

	public static void main(String[] args) {
		
		Student student= new Student();
		student.name="Mike";
		//student.ssn=23456; not vissible 
		//student.age=44; it is not visible because this class in different package
		//student.campus="Chicago" it is not visible 
		
	}

}
