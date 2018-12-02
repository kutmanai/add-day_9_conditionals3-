package day_14_stringmanipulation;
// this is the name of the class . everything happens inside the class
public class StringAndValues {
 static String str;
 //declaring a variable without any value
 //java will put null value bt default
	public static void main(String[] args) {
	// we are declaring a main method	
		
	//will print null because no valid assigned	
		System.out.println(str);
		//assigning value into str
		str ="a";
		// will print a
     System.out.println(str);
       str.length();
     System.out.println(str);
     str ="b";
     System.out.println(str);
     System.out.println(str +"AAA");
     System.out.println(str);
     
     str =str +"AAA";
     System.out.println(str);
     // created a new variable and gave value "a"
     String mystring=" a";
     //printing the trimmed version of mystring
     //this line will not affect the original value of mystring variable
     System.out.println(mystring.trim());
     //prints the value of mystring which still contains spaces
     System.out.println(mystring);
     
     
	}

}
