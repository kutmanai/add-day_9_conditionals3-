package day_40_classes_objects;

public class StudentName {

	public static void main(String[] args) {
		
 Student s1= new Student();
 Student s2= new Student();
 s1.name= " James";
 s1.age=40;
 s1.email=" james@gmail.com";
  
 
 s2.name="Adam";
 s2.age=34;
 s2.email="adam2018@gmail.com";
 s1.read();
 s2.read();
 
 Book book = new Book();
 book.author=" Mark Devane";
 book.title="unbeatball";
 book.pages=400;
  s1.read(book);
  s2.read(book);

	}

}
