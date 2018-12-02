package day_41_constructors;

public class Cat {
	
	String  gender;
	String breed;
	 boolean shy;
	int age;
	String color;
	String behaviour;
	
	public Cat() {
		
	}
	
	public Cat(String gender1, String breed1, int age1) {
		gender= gender1;
		breed=breed1;
		if(age1>0 && age1<15) {
			age=age1;
			
		}else {
			System.out.println(" Your cat is age invalid");
		}
		
		
	}
	
	public  Cat(String gender1, String breed1) {
		gender =gender1;
		breed=breed1;
		System.out.println(" Cat constructor is getting cold");
		
	}
	
	public void eat() {
		System.out.println(" Cat is eating");
	}
	
	

}
