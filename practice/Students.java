package practice;

public class Students {
	String firstName;
	String lastName;
	static int studentCount;
	
	public Students (String fN, String lN) {
		
		firstName=fN;
		lastName=lN;
		studentCount ++;
		System.out.println("Added student :" + fN + " " +lN);
		System.out.println("Number of students " + studentCount);
		
	}

}
