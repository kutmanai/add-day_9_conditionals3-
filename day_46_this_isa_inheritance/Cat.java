package day_46_this_isa_inheritance;

public class Cat {
	int age;
	String name;
	static boolean isThereCatDisease;
    
	
	public Cat(){
		System.out.println("Constructor for CAT");
	}
	
	{
		System.out.println("Hey guys");
		age=1;
		name="Chili";
	}
	 static {
		 System.out.println("Hey  guys from Static block");
		 isThereCatDisease=false;
		 
	 }
	 static {
		 System.out.println("Second Static block");
	 }
//	public Cat(String name) {
//		this.name=name;
//	}

}
