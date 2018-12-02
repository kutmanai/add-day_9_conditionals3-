package day_43_reviewstatic_method;

import java.util.ArrayList;
import java.util.List;

 public class FacebookApp {
	
 static List<FacebookUser> users= new ArrayList<>();
  
  public static  void loadUsers(List<String> names) {
	  for(String name:names) {
		   String username=CustomData.genereteUsername(name);
		   String password=CustomData.generetePassword(name);
		   
		   FacebookUser user = new FacebookUser(username,password,name);
		   users.add(user);   
		   
	  }  
	
  }
	
  
  public static void  seeAllFacebookUsers() {
	   for(FacebookUser user:users) {
		   user.userInfo();
	   }
	 
   }
  
  public static  boolean userExists(String username) {
	  
	                  for(FacebookUser user:users) {
	                	  if(user.username.equals(username)) {
	                		  return true;
	                	  }
	                  }
	return  false;
	  
  }
   public static void addUser(FacebookUser user) {
	   if(userExists(user.username)) {
		   System.out.println("User already exists in the system");
	   }
	   else {
		   users.add(user);
	   }
	   
   }
    public static  void removeUser(FacebookUser  user) {
    	for(FacebookUser u:users) {
    		if(u.username.equals(user.username)) {
    			users.remove(user);
    			break;
    		}
    	}
    	
    }
  
}
