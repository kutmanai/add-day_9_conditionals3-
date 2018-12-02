package reviewloops;

public class MethodExamples1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // length
		
		 String word="Welcome to Java";
		 System.out.println(word.length());
		 
		 //charAt()
		 System.out.println(word.charAt(4));
		 
		 // indexOf
		 System.out.println(word.indexOf('W')); // ALSO WORK
		 System.out.println(word.indexOf("W"));
		 System.out.println(word.indexOf('o',5)); // find 'o'  from start index 5
		 System.out.println(" Check this line " + word.indexOf("a",8)) ;
		 //concat()
		 String text =" Cool";
		 System.out.println(word.concat(text));
		 System.out.println(word + text); // also  will show the same output
		 
		 
		 // toUpperCase()
		 System.out.println(text.toLowerCase());
		  // trim()
		 String text1="  Welcome to Java  World   ";
		 System.out.println(text1);
		 System.out.println(text1.trim());
		 
		 // substring()
		 
		 String text2="Welcome to Java World";
		             // /0123456
		 System.out.println(text2.substring(5));
		 
		 System.out.println(text2.substring(11, 15));
		 
		 // contains()
		 
		 System.out.println(text2.contains("Welcome")); /// you can use sentence and single char too .
		 
		 //replace
		 
		 String s1="Cam is awesome";
		 System.out.println(s1);
		 System.out.println(s1.replace("is", " was"));
		 
		 String  s2=" Cam";
		 String s3="am";
		 System.out.println(s2.equalsIgnoreCase("cam"));
		 System.out.println(s2.equals("cam")); // false because 'C' & 'c' fails
		 
		 
		  String word10="Java Exercises";
		  System.out.println(word10.indexOf(word10));
		              
		 
		 
	}

}
