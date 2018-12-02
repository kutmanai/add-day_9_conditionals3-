package day_37_wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleWithPrimitiveTypes {

	public static void main(String[] args) {
		int age=26;
		Integer age2=26;
		int[] ages= new int[10];
		List<Integer> ages2= new ArrayList<>();
		ages2.add(34);
		ages2.add(100);
		ages2.add(273);
		System.out.println(ages2);
//		String s=" 512";
//		Integer.valueOf(s);
		//System.out.println(s);
	}

}
