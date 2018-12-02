package day_40_classes_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamplesOfObject {

	public static void main(String[] args) {
		
		List<String> names= new ArrayList<>();
		Scanner s = new Scanner(System.in);
		 for(int i=0; i<5; i++) {
			 System.out.println(" Please enter names:");
			 String name= s.nextLine();
			 names.add(name);
		 }
	}

}
