package day_40_classes_objects;

public class Jobs {

	public static void main(String[] args) {
		
 Employee epm1 = new Employee();
 epm1.firstName="Mike";
 epm1.lastname="Smith";
 epm1.jobTitle="Scrum Master";
 epm1.email=epm1.firstName+epm1.lastname+"@mail.com";
 epm1.hoursalary=65.0;
 
 
  Employee emp2= new Employee();
  emp2.firstName="Sam";
  emp2.lastname="Joy";
  emp2.jobTitle="SDET";
  emp2.email=emp2.firstName+emp2.lastname+"@mail.com";
  emp2.hoursalary=55.0;
  
  System.out.println("Email epm1:"+ epm1.email);
  System.out.println("Email epm2:" + emp2.email);
  
 
  epm1.work();
  emp2.work();
 
	}

}
