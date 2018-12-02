package reviewloops;

import java.util.Arrays;

public class OfficeHoursArrays {

	public static void main(String[] args) {
		

            int var1=1;
            int var2=2;
            int[] arr = { 1,2};
            System.out.println(arr[0]);
            
            int[] intarr= new int [10];
            String[] stringArr;
             for(int i =0; i <intarr.length; i ++) {
            	 intarr[i]=i;
             }
             System.out.println(Arrays.toString(intarr));
             int[] newarr= new int[100];
             for(int i =0; i <intarr.length; i ++) {
            	 newarr[i] =intarr[i]=i;
            
            	
            	 
             }
             
             System.out.println(Arrays.toString(intarr));
             
             
             
	}

}
