package day_27_stringwitharraysreview;

public class ArrayCopySomeValues {

	public static void main(String[] args) {
		
 
		
		String[] arr= {"remote","local","bread","cell","brain","keys"};
		//count how many words have 'e' in the arr
		int counter=0;
		for(String str:arr) {
			if(str.contains("e")) {
				counter++;
			}
		}
		System.out.println(counter);
		//create array few values, with size of counter
		String [] fewValues= new String[counter];
		//go over arr one more time and add the words with 'e' into fewValues.
		
	        int i=0;
	        for(String each:arr) {
	        	if(each.contains("e")) {
	        		fewValues[i]=each;
	        		i++;
	        	}
	        }
	         for(String val:fewValues) {
	        	 System.out.println(val + " ");
	         }
		
		
		
		

	}

}
