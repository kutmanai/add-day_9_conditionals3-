package mentoringsession;

public class NestedPatterns {

	public static void main(String[] args) {
		
		
	// Display four patterns using loop/ Use nested loops display the following
		//patterns in four separate program.
		
		
		 for (int row =0; row <=6; row++) {
			 for(int column=1; column<=row; column++) {
				 System.out.print(column + " ");
			 }
			 System.out.println();
			 
		 }
		 System.out.println("\n\n=======Patern B=======");

		 //Pattern B
		 for (int row =1; row <=7; row++) {
			 for(int column=1; column<=7-row; column++) {
				 System.out.print(column + " ");
			 }
			 System.out.println();
			 
		 }
		 System.out.println("\n\n=======Patern C=======");

		 for (int row =1; row <=6; row++) {
			 for(int column=1; column<=6-row; column++) {
				 System.out.print(column + " ");
			 }
			 System.out.println();
			 
		 
		 

	}

}
}

