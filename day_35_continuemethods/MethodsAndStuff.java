package day_35_continuemethods;

public class MethodsAndStuff {

	public static void main(String[] args) {
		 String str = "bless you";
	    str= delete(str,"you");
		 System.out.println(str);
		 System.out.println();
		 
		 String str1 ="halloweenn";
		 String str2 = "ll";
		 int count =numberOfcurrences(str1,str2);
		 System.out.println(count);
		

	}
	
	/*
	 * delete utility 
	 * will delete a given character from the given thing
	 * 
	 */
	
	public static String delete(String str1, String str2) {
		String newOne =str1.replace(str2,"");
		
		return newOne;
		
	}
	
	/*
	 * given a string ,  write a method returns 
	 * how many times a String  certain characters appears on a String
	 */
  public static int numberOfcurrences( String str1 , String str2 ) {
	  int count =0;
	     for(int i=0; i<str1.length()-str2.length()+1; i++) {
	    	 String current=str1.substring(i, i+str2.length());
	    	 if(current.equals(str2)) {
	    		 count++;
	    		 
	    	 }
	    	 
	     }
	   return count;
	  
  }
}
