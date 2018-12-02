package day_37_wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class Conversion {

	public static void main(String[] args) {
		
 int  age=56;
 
 Integer age2=age;
 boolean raining= false;
 Boolean raining2=raining;
 int i=10;
 List<Integer> ages = new ArrayList<>();
 ages.add(age2);
 ages.add(i);
 ages.add(34);
 System.out.println(ages);
 // If Integer gets converted to int type then it is Unboxing
 // valueOf --> gets value of certain data type
 
 
      
  List<Double> transactions = new ArrayList<>();
  String s = " transaction amount is 34545.5 ";
  String [] words= s.split(" "); 
    
  double d= Double.valueOf(words[words.length-1]);
  System.out.println(d);
  

//  s=s.replaceAll("\\D+"," ");
//  System.out.println(s);
//  
	}

}
