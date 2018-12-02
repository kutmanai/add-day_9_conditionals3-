package day_41_constructors;

public class UsersFacebook {

	public static void main(String[] args) {
		
		FacebookUser user1 = new FacebookUser("kutmanai", "123456" );
		//System.out.println(user1.username);
		//System.out.println(user1.password);
		user1.friends=4000;
		
		FacebookUser user2 = new FacebookUser("Adam","123");
		 user2.age=32;
		 user2.name="Adam Smith";
		 user2.friends=300;
		System.out.println(user2.friends);
		System.out.println(user2.name);
		
		FacebookUser user3= new FacebookUser("john", " john123", "John Doe");
		System.out.println(user3.password);
		user3.sendFrienRequest(user1);
		
		
		 boolean check=user3.sendFrienRequest(user1);
				 System.out.println(check);
				 
		 System.out.println("------");
		 user1.userInfo();
		 user2.userInfo();
		 user3.userInfo();
		 
		 
		 System.out.println("===== DELETE ACCOUNTS======\n");
		 user1.userInfo();
		// System.out.println(user.hashCode());
		 FacebookUser.deleteAccount(user1);
		 user1.userInfo();
		 
		 System.out.println(" -------TO SEE USER INFO------");
		 user3.userInfo();
		 FacebookUser.usersInfo(user3);
		 
		 
		
	
		
		
		
		
		
	}

}
