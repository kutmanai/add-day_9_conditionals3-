package day_12_object_strings;

public class StringClass {

	public static void main(String[] args) {
		String name="Kutmanai";
		//1.declaring variable->String name.
		//variable name is name and type is String
		// Hey java , i want you to create a variable called name
		// that can have store String objects
		//2. Assign value-String objects.
		// Anything i double quotes is String objects with that value.
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name);
		name=name.toUpperCase();
		System.out.println(name);
		System.out.println(name.length());
		System.out.println("java".length());
		int count =name.length();
		System.out.println(" count is" +count);
		if(name.charAt(0) =='M') {
			System.out.println("K is first letter");
		}else {
			System.out.println("K is not first letter");
		}
		char secondChar=name.charAt(1);
		System.out.println(secondChar);


	}

}
