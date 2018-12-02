package day_43_reviewstatic_method;

public class WhatsApp {

	public static void main(String[] args) {
//		String name="Adam";
//		
//		CustomData.genereteUsername(name);
//		CustomData.generetePassword(name);
//		System.out.println(name);
//		
		
		Post p1 = new Post();
		System.out.println(p1.getPostID());
		p1.setBody(" Today is good day!!");
		p1.setData(" Novemver 11 2018");
		p1.postInfo();
		
		FacebookUser user1= new FacebookUser("jamie32","123");
		user1.post(p1);
		System.out.println(user1.posts.get(0).getBody());
		
	}

}
