package day_40_classes_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookReader {

	public static void main(String[] args) {
		
       Book b1= new Book();
       b1.title=" Unbeatable mind";
       b1.author=" Mark Devine";
       b1.pages=300;
       
        Book b2= new Book();
        b2.title="  Zero to one";
        b2.author=" Black Master";
        b2.pages=130;
        
        Book b3= new Book();
        b3.title="Sell or be Sold";
        b3.author="Grant Cardone";
        b3.pages=150;
        
         List<Book> myBooks= new ArrayList<>();
         myBooks.add(b1);
         myBooks.add(b2);
         myBooks.add(b3);
          
         for(Book book:myBooks) {
        	 System.out.println(book.author);
         }
         
         /*
          * 
          * 
          * 3. Create a program that asks from user to enter total books and asks title, author and pages. Then store each book to the list.Input: 
          * Please enter total books:-2Please enter title for book 1:-Leaders eat lastPlease enter author for book1:-Simon SinekPlease enter pages for book1:-300Please
          *  enter title for book 2:-Zero to onePlease enter author for book 2:-Blake MastersPlease enter pages for book 2:-140Note: Print size of list of books and it should print 2. 

          */
         
         
          
           

	}

}
