package day_34_method_overloading;

public class PalindromWithMethods {

	public static void main(String[] args) {
//		Method name: isPalindrome
//		Return type boolean
//		Accepts a String as parameter
//		Returns the value as boolean (true/false) if the given string is palindrome or not
//		Output should be like: true, or false
//		
         String name2="civic";
         System.out.println(isPalindrome(name2));
	}
	
	public static boolean isPalindrome( String name) {
		 
		String str="";
		for(int i=name.length()-1; i>=0; i--) {
			str +=name.charAt(i);
			//str=str+name.charAt();
		}
		if(!str.equals(name)) {
			return false;
			
		}else {
			return true;
		}
		
		
		
		
		
		 
	}

}
