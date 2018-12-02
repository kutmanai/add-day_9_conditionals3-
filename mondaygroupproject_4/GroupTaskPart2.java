package mondaygroupproject_4;

import java.util.Scanner;

public class GroupTaskPart2 {

	public static void main(String[] args) {
		 //Task1
	             Scanner scan = new Scanner(System.in);
	             System.out.println("Input a number: ");
	             int num=scan.nextInt();
	              for (int i=0; i < 10; i ++) {
	            	  System.out.println(num + "x" + (i+1) + "=" +(num* (i+1)));
	            	  
	              }
		}
	
	}
