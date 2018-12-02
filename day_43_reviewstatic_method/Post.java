package day_43_reviewstatic_method;

import java.util.Random;

public class Post {

	 private String body;
	 private int likes;
	 private String data;
	 private int postID;
	 
	 public Post() {
		 Random r = new Random();
		 postID=r.nextInt(3000);
	 }
	 
	 public void postInfo() {
		 
		 System.out.println("Body "+body);
		 System.out.println("Likes "+likes);
		 System.out.println("Data" + data);
	 }
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getPostID() {
		return postID;
	}
	public void setPostID(int postID) {
		this.postID = postID;
	}
	 
	 
}
