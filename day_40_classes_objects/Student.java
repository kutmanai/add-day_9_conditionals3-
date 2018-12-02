package day_40_classes_objects;

public class Student {
	
    String name;
    int age;
    String email;
    
    
     public void read () {
    	 System.out.println(" student" + name + " is reading");
    	 
     }
     
     public void read(Book book) {
    	 System.out.println(" Student " + name + " is reading "+book.title+ " by author" );
     }
}
