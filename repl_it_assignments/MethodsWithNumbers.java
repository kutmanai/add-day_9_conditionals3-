package repl_it_assignments;

import java.util.Scanner;

public class MethodsWithNumbers {

	
		public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++)
		    {

		        arr[i]=inp.nextInt();
		    }
		    
		    plus_minus(arr);
		  }//end main
		  public static void plus_minus(int [] num){
		    int positive =0;
		    int negative=0;
		    int zero=0;
		    
		    for( int  i=0; i<num.length; i++){
		      if(num[i]>0){
		      positive++;
		    }else if(num[i]==0){
		       zero ++;
		      
		    }else{
		      negative++;
		    }
		    System.out.println("positives: " +positive+" ");
		    System.out.println("negatives: " + negative+" ");
		    System.out.println("zeros: " + zero);
		    
		    
		    
		  }
		  
	}

}
