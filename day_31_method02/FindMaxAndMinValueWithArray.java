package day_31_method02;

import java.util.Arrays;

public class FindMaxAndMinValueWithArray {

	public static void main(String[] args) {
		 int[] grades= { 15,25,33,35,66,44,78,95,1,500};
		  Arrays.sort(grades);
		   int minGrade=grades[0];
		   int maxGrade=grades[0];
		   for( int i=0; i<grades.length; i++) {
			   if(maxGrade<grades[i]) {
				   maxGrade=grades[i];
			   }
			   if(minGrade>grades[i]) {
				   minGrade=grades[i];
			   }
		   }
		   System.out.println("Minimum grade :" +minGrade);
		   System.out.println("Maxium grade:" + maxGrade);
		 
				
		
		 

	}

}
