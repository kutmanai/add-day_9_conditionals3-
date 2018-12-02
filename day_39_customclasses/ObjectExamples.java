package day_39_customclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectExamples {

	public static void main(String[] args) {
//		String s= " Jmaes";
//		Random r= new Random();
		
		
        Iphone myPhone= new Iphone();
        myPhone.model="iPhone 8 Plus";
        myPhone.memory=64;
     
        myPhone.color="Silver";
        System.out.println(myPhone.memory);
        System.out.println(myPhone.color);
        Iphone kamilsPhone= new Iphone();
        System.out.println(kamilsPhone.model);
        kamilsPhone.model =" Iphone XS max";
        kamilsPhone.memory=128;
        kamilsPhone.color="Gold";
//        System.out.println(kamilsPhone.model);
//        System.out.println(myPhone.model);
//        myPhone=kamilsPhone;
//        System.out.println(myPhone.model);
        
        
     kamilsPhone.printPhoneInfo();
     System.out.println();
     myPhone.printPhoneInfo();
     List<Iphone> phones =new ArrayList<>();
     phones.add(myPhone);
     phones.add(kamilsPhone);
       for( Iphone i: phones) {
    	   System.out.println(i.model);
       }

	}

}
