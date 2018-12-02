package practice;

public class EmployeesWithDepartment {

	public static void main(String[] args) {
		
		Employee Sarah = new Employee(123,"Sarah","Sanders", 6000.0);
		
		Department ITDepartment= new Department(10,"IT");
		Sarah.setDepartment(ITDepartment);
		//print Sarah's department name;
		System.out.println(Sarah.getDepartment().getdepartmentName());
		
		
		
		

	}

}
