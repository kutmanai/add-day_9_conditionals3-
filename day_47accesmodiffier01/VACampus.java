package day_47accesmodiffier01;

//VACampus has -a 
public class VACampus {
	VACampusStudent  campusStudent = new VACampusStudent();
	
	public static void main(String[] args) {
		Student student = new Student();
		student.name="Kutmanai"; //public
		//student.ssn ssn is private.
		student.age=27;
		student.campus="Cybertek";
		
		
	}
	

	
}
