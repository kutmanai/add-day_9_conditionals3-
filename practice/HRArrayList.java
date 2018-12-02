package practice;

import java.util.ArrayList;
import java.util.List;

public class HRArrayList {

	public static void main(String[] args) {
		System.out.println("============ArrayList====================");
		
		//create an arraylist  that can hold Employee object
		
		List<Employee> employees= new ArrayList<>();
		
		//List<String>
		 employees.add(new Employee(100,"Steven","King",4500.0));
		 employees.add(new Employee(101,"Kutmanai","Sanders",5500.0));
		 employees.add(new Employee(102,"Bob","Marshal",3500.0));
		 
		 //increase Bob's salary by 1000
		 
		double newSalary= employees.get(2).getSalary()+1000;
		employees.get(2).setSalary(newSalary);
		System.out.println("Bob's salary: " + employees.get(2).getSalary());
		
		//Look for employees whose salary is more than 5000 and print
		//last name
		//
		 
		  for(Employee employee:employees) {
			  if(employee.getSalary()>4000) {
				  System.out.println(employee.getFirstName()+" " + employee.getLastName()+ " "+employee.getSalary());
			  }
			  
		  }

	}

}
