package repeattask;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//declare array names that store 5 names
		String[]names=new String[5];
		names[0]="Kutmanai";
		names[1]="Oroz";
		names[2]="Nurkan";
		names[3]="Dastan";
		names[4]="Azamat";
		
		System.out.println(names.length);
		//String name and assign Oroz to it by reading from array
		
		String name= names[1];
		System.out.println(name.length());
	}

}
