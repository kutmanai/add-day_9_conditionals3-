package day_22loops05;

public class NestedLoopTask2 {

	public static void main(String[] args) {
		
		
		for (int outer=10; outer>=1; outer--) {
			for(int inner =1; inner<=outer; inner++) {
				System.out.print(inner + " ");
			}
			
			System.out.println();
		}

	}

}
