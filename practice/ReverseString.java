package practice;

public class ReverseString {

	public static void main(String[] args) {
		
		 String reverse ="";
		  String word = " kutmanai,Welcome Java";
		   for(int i =word.length()-1; i>=0; i--) {
			   reverse+=word.charAt(i)+"" ;
			   
			   
		   }
		   
		   if(word.equals(reverse)) {
			   System.out.println(" It is a palindrome");
	   }
	   else {
			   System.out.println(" It is notPalindrome");
	   }
		   
		   
		   System.out.println(reverse);
		
		String input = "Welcome to Java"; 
		  
        StringBuilder word1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        word1.append(input); 
  
        // reverse StringBuilder input1 
        word1 = word1.reverse(); 
  
        // print reversed String 
        System.out.println(word1); 
		

//        String input = "Welcome to Java"; 
//  
//        // convert String to character array 
//        // by using toCharArray 
//        char[] try1 = input.toCharArray(); 
//  
//        for (int i = try1.length-1; i>=0; i--) 
//            System.out.print(try1[i]); 
		   
        //Then , scan the string from end to start, and print the character
        //one by one
        
		   
		   
		   
		   
		    
	}

}
