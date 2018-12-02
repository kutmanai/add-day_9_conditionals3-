package day_41_constructors;

import java.util.ArrayList;
import java.util.List;

import day_43_reviewstatic_method.Post;

public class FacebookUser {
	 String username;
	 int age;
	 String name;
	 String password;
	 int friends;
	 int listOfPosts;
	 List<Post>posts=new ArrayList<>();
	 
	 
	 public FacebookUser( String username1, String password1 ) {
		this. username=username1;
		this. password=password1;
		 
		 
		 
		 
		 
	 }
	 
	 public  FacebookUser( String name,String username, String password) {
		 if(!password.contains(username)) {
			 this.password=password;
		 }else {
			 System.out.print("password can t contain username. Please change");
			 this.password="";
		 }
		 this.username=username;
		 this.name=name;
		 
	 }
	 
	 public void post(Post post) {
		 System.out.println("\n Your new post here\n");
		 post.postInfo();
		 posts.add(post);
	 }
	 
	 public  boolean sendFrienRequest(FacebookUser targetUser) {
		  if(targetUser.friends<5000) {
			  System.out.println(" Friend request to sent to target user name" + targetUser.username);
			  return true;
			  
		  }else {
			  System.out.println(targetUser.username + " can't accept friends");
			  return false;
			  
		  }
			  
		  }
		  
	 
	 
	 public  void userInfo() {
		 System.out.println(" Name:" + name);
		 System.out.println("Username" + this.username);
		 System.out.println("Age" + this.age);
		 System.out.println( " Number of friends" +this.friends);
		 
		 
		 
	 }
	 
	 
	 public static void deleteAccount(FacebookUser user) {
		 user.age=0;
		 user.name=null;
		 user.username=null;
		 user.password=null;
		 user.friends=0;
		 
	 }
	 
	 public static void usersInfo(FacebookUser user) {
		 user.userInfo();
		 
	 }
	 

}
