package day_24arrays;

public class ArrayLength {

	public static void main(String[] args) {
		
//       String[] names1={"Kutmanai","Nariste","Adina","Chynara", "Aijan"};
//       String name :names1;
//       System.out.println(names[0]);
//		
		//declare array names that store 5 names.
		String[]names =new String[5];
		names[0]="Serik";
		names[1]="Kalili";
		names[2]="Z";
		names[3]="Erkam";
		names[4]="Zarina";
		System.out.println(names.length);//count of values in array
		//String name and assign Kalili to it by reading from array
		String name=names[1];
		System.out.println(name);

	}

}
