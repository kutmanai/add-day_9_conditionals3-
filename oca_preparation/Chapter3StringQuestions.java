package oca_preparation;

public class Chapter3StringQuestions {

	public static void main(String[] args) {
		//Q5
		StringBuilder s1= new StringBuilder();
		String s2="abc";
		String s3="abc";
		System.out.println(s2==s3);
		//System.out.println(s1==s2);//does not compile
		//Q8
		String numbers="012345678";
		System.out.println(numbers.substring(1,3));
		System.out.println(numbers.substring(7,7));
		System.out.println(numbers.substring(7));
		//Q9
		String s="purr";
		s.toUpperCase();
		s.trim();
		s.substring(1,3);
		s+="two";
		System.out.println(s.length());
		//Q10
		 String a="";
		 a+=2;
		 a+='c';
		 a+=false;
		 if(a=="2cfalse") System.out.println("==");
		 if(a.equals("2cfalse")) System.out.println("equals");
		 
		 //		Q11
		  int total=0;
		  StringBuilder letters= new StringBuilder("abcdefg");
		  total+=letters.substring(1, 2).length();
		  total+=letters.substring(6, 6).length();
		  total+=letters.substring(6, 5).length();
		  System.out.println(total);
		   //12
		  StringBuilder numbers1= new StringBuilder("0123456789");
		  numbers1.delete(2, 8);
		  numbers1.append("-").insert(2, "+");
		  System.out.println(numbers1);
		  
		  //13
		 // StringBuilder b="rumble";
		  
		  
		

	}

}
