package practice;

public class HR {

	public static void main(String[] args) {
		
		//Array of 3 Employee object
		
		
		Employee[] employees= new Employee[3];
		
		employees[0]= new Employee(100,"Steven","Kind",6000);
		employees[1]=new Employee(101,"Bob","Smith",5000.0);
		employees[2]=new Employee(102,"Sarah","Paker",7000.0); 
		
		//print the name and salary of first employee in the employees array
		
		System.out.println(employees[0].getFirstName() + ":"+employees[0].getSalary());
		
		//loop through each employee and print first name and salary
		for(Employee  emp:employees) {
			System.out.println(emp.getFirstName()+ ":"+ emp.getSalary());
		}
		
		//for loop
		for(int index=0; index<employees.length; index++) {
			Employee tempEmp=employees[index];
			System.out.println(tempEmp.getFirstName()+":" +employees[index].getSalary());
		}
		System.out.println("============ArrayList====================");
		
		//create an arraylist  that can hold Employee object
		
		
		
		
		
		

	}

}
