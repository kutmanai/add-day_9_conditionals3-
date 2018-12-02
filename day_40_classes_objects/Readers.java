package day_40_classes_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Readers {

	public static void main(String[] args) {
		       /*
		        *  3. Create a program that asks from user to enter total books and asks title, author and pages. 
		        *  Then store each book to the list.Input: Please enter total books:-2
		        *  Please enter title for book 1:-Leaders eat lastPlease enter author for book1:-Simon SinekPlease enter pages for book1:-300Please enter title for book 2:-Zero to onePlease enter author for book 2:-Blake MastersPlease enter pages for book 2:-140Note: Print size of list of books and it should print 2. 
 
		        */
		
		 Scanner scan = new Scanner (System.in);
		 System.out.println(" Please enter total Books:");
	     int totalBooks= scan.nextInt();
	     //System.out.println(" Please enter total Books");
		    
		    List<Book> myBooks = new ArrayList<>();
		      for ( int i =0; i<totalBooks; i++) {
		    	 Book b1= new Book();
		    	 
		    	 System.out.println(" Please enter title for book" + (i+1));
		    	 b1.title=scan.next();
		    	 System.out.println(" Please enter author for book" + ( i+1));
		    	 b1.author=scan.next();
		    	 System.out.println("Please enter pages for Book " + (i+1));
		    	 b1.pages=scan.nextInt();
		    	 
		    	  	 System.out.println(myBooks.size()); 
		    	  
		      }
		      
		      
		       
		     
		     
		    
		
		
	}

}
