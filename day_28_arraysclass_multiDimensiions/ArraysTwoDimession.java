package day_28_arraysclass_multiDimensiions;

public class ArraysTwoDimession {

	public static void main(String[] args) {
		
    // int [] [] numbers= {{1,2,3,},{10,20,30},{100,200,300}};
     int [] [] numbers=new int[3][];
   //  System.out.println(numbers[1][3]);
     int [] ages = {26,25,50,100};
     
     numbers[0]= new int [4];
     numbers[0]=ages;
     System.out.println(numbers[0][2]);
     
	}

}
