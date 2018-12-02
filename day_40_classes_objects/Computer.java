package day_40_classes_objects;

public class Computer {
	/*
	 * 4.   Create a class Computer Instance variables: model, color, memory, size, new(boolean)
	 * Instance variables: -> turnOn: void method, 
	 * print “computer turning on”-> turnOff: void method, print “%model turning off”
	 */
    String model ;
    String color;
    int memory;
    int size;
    boolean condition;
    
    
	 public void turnOn() {
		 System.out.println(" Computer turning on");
	 }
	 
	 public void turnOff() {
		 System.out.println( model+ " is turning Off:");
	 }
	
	
	
}

