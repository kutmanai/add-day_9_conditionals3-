package day_48_overriding;

public class LocalStudent  extends Student{
	int seatID;
	public LocalStudent() {
		super("SOMENAME",123); //once you call another constructor like this
		//compiler will not insert super() in first line
		System.out.println("no arg from localStudent");
	}
	
	public LocalStudent(int seatID) {
		this(); //once another constructor is called , compiler will not insert super() in first line
		
		this.seatID=seatID;
		System.out.println("message from 1 arg constructor of localStudent");
	}

}
