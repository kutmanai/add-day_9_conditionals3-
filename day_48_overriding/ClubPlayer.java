package day_48_overriding;

public class ClubPlayer  extends SoccerPlayer{
	String  name;
	
	@Override
	public void eat() {
		System.out.println("Club players are eating");
		super.eat();
		super.name="dj";
	}
	
	

}
