package mentoringsession;

public class NumbersStars {

	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 123456
		 * 1234567
		 * 12345678
		 * 123456789
		 * 12345678910
		 */
		
		
		for(int  outer=1; outer<=9; outer++) {
			//System.out.println(outer);
			//inner loop 
			for(int inner=1; inner<=outer; inner++) {
				System.out.print(inner);
			}
			System.out.println();
		}
	}

}
