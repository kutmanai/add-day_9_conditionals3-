package day_41_constructors;

public class Car {
	String make;
    int year;
    boolean sportEdition;
    int mileage;
    
   
    
    public void drive() {
    	System.out.println( year + " " + make+ " is driving");
    	mileage +=10;
    	
    }
    public void drive(String destination) {
    	System.out.println(year + " " +make+ " is driving to" + destination);
    	mileage +=10;
    	
    	
    }
    public void drive(int miles) {
    	System.out.println(year+ " " + make+ " is driving" + miles + "mile");
    	mileage+=miles;
    }

}
