package day_31_method02;

import java.util.Arrays;

public class Shows {

	public static void main(String[] args) {
		 String[] movie= { "Game of Thrones", "Friends"," Prison break","Doctor Who"," Greys Anatomy"};
		 Arrays.sort(movie);
		 System.out.println("Sorted list of movie");
		 for( int i =0; i<movie.length; i++) {
			 System.out.println("#" + i + " " +movie[i]);
			 
			 
		 }
		  
	}

}
