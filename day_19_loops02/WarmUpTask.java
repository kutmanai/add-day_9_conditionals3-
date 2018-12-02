package day_19_loops02;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		 
		String  word ="jAVA";
		 System.out.println(word.substring(0,1).toUpperCase());
		// System.out.println(word.substring(1).toLowerCase());
        word=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
       System.out.println(word);
       
             int num= 0;
              while(num<10) {
            	  System.out.print(num +" ");
           	  num++;
              }
              System.out.println(" Num value:" +num);
           	  System.out.println("===============================================");
		
		int num1=10;
		while(num1>=1) {
			System.out.print(num1 + " ");
			num1--;
              }
		       
		System.out.println(" Number value " +num1);
	}

}
