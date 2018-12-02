package day_12_object_strings;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
 String secretUserName="admin1";
 String secretPassword="abc123";
  String userName="AdMIN1";
  
  String password="abc1234";
  
  
  
    if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
    	System.out.println("Login Succsesful. Welcome back!");
    } else {
    	if (!userName.equalsIgnoreCase(secretUserName) && !password.equals(secretPassword)) {
    		System.out.println("error :both username and password are invalid");
    	}else if (!userName.equalsIgnoreCase(secretUserName)) {
    		System.out.println("error:user name  is not valid");
    	}else {
    		System.out.println("error : password is not valid");
    	}
    }
    	
    		
         
    	
    	
    }  
    		
    
    
	   
    	
    }
    
      
    
	

