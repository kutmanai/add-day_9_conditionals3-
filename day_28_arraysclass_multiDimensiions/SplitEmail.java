package day_28_arraysclass_multiDimensiions;

public class SplitEmail {

	public static void main(String[] args) {
		  
		String email="info@cybertekschool.com";
		String [] splitted=email.split("@");
		
		  //String[] splitted =  email.split("@");
		  //System.out.println(splitted.length);
		  if(splitted.length==2) {
		  System.out.println("Email id:" +splitted[0]);
		  
		  System.out.println("Email domain:" + splitted[1]) ;
		  
		}else {
			System.out.println("Invalid email");
		}
//		  String str="Today is Satyrday";
//		  String[] arr=str.split("Sat");
//		  System.out.println(arr[0]);
//		  System.out.println(arr[1]); 

	}

}
