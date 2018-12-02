package day_34_method_overloading;

public class StringWithOverloadedMethod {

	public static void main(String[] args) {
		 int [] number = {32,45,69,90};
		 words(number);
		 String[] name= {"James,Adam,John,Alize"};
		 array(name);
		
	}
	public static void words(int[]  num) {
		
		for( int i =0; i <num.length; i++) {
			if(num[i]==num[num.length-1]) {
			
			System.out.print(num[i] + " ");
					 
		}else {
			System.out.print(num[i] + " ,");
		}
		
		
		}
		System.out.println();
		
	}
	
	    
	
	public static void array(String [] j) {
		for (int k=0; k<j.length; k++) {
			if(j[k].equals(j[j.length-1])) {
				System.out.print(j[k]+ " ");
				
			}else {
				System.out.print(j[k] + ",");
			}
			
			
			
		}
		
	}

}
