package day_21loops03;

public class Continue {

	public static void main(String[] args) {
		
      for (int i=1; i<=5; i++) {
    	  System.out.println(i);
    	  if (i>2) {
    		  break;
    	  }
      }
       for (int k=0; k<=10; k++) {
    	   if(k==1 || k==2) {
    		   continue;
    	   }
    	   System.out.println("Value of k" +k);
       }
        for (int num=1; num<=50; num++) {
        	if(num%5==0) {
        		continue;
        	}
        	if(num%2==0) {
        		break;
        	}
        	System.out.println(num + " ");
        }
       
	}

}
