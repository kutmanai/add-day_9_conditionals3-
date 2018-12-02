package day_40_classes_objects;

public class LibraryWithEncapsulationMethod {
	public static void main(String[] args) {
		BooksEncapsulation book1= new BooksEncapsulation();
		book1.setTitle("Silence");
		book1.setAuthor("Mike Smith");
		book1.setPages(321);
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		System.out.println(book1.getPages());
	
	
	BooksEncapsulation javaBook= new BooksEncapsulation();
	javaBook.setTitle("Headfirst Java");
	javaBook.setAuthor("Kathy Sierra,Bert Bates");
	javaBook.setPages(543);
	
	System.out.println(" Title1:" +book1.getTitle());
	System.out.println("Title2:"+javaBook.getTitle());
	
	
	System.out.println("Author1:" + book1.getAuthor());
	System.out.println("Author2:" + javaBook.getAuthor());
	
	
}


}
