package day_43_reviewstatic_method;

import java.util.ArrayList;
import java.util.List;

public class FacebookFans {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("James Bond");
		names.add("Karim Benzema");
		names.add("Cristian Ronaldo");
		names.add("Steven Gerrard");
		names.add("Jon Smoke");
		names.add("Lionel Messi");
		
		FacebookApp.loadUsers(names);
		
		FacebookApp.seeAllFacebookUsers();
		
		Post p1= new Post();
		p1.setBody("I scored today! And i am happy");
		p1.setData("Nov 11, 2018");
		p1.setLikes(2344);
		 FacebookUser benzema=FacebookApp.users.get(1);
		 benzema.post(p1);
		 
		 
		 FacebookApp.removeUser(benzema);
		 FacebookApp.seeAllFacebookUsers();
		 System.out.println("--------------");
		 
		 FacebookUser gerrard=FacebookApp.users.get(3);
		 FacebookUser smoke=FacebookApp.users.get(4);
		 
		 smoke.sendFrienRequest(gerrard);
		 
		 System.out.println(gerrard.requests.get(0).name);
		 
		 
		
		
	}

}
