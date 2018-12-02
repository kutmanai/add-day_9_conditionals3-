package day_48_overriding;

public class Game {

	public static void main(String[] args) {
		SoccerPlayer p1 = new  SoccerPlayer();
		p1.age=30;
		p1.gender="male";
		p1.name="Benzema";
		p1.bycycleKick();
		p1.train();
		p1.eat();
		p1.run();
		p1.hunt();
		p1.basketbowlPlayer();
		
		
		ClubPlayer c1= new ClubPlayer();
		c1.run();
		SoccerPlayer.sleep();
		c1.eat();
		
		System.out.println(c1.name);
		
		 final int i=5;
		//i=2;
		
		

	}

}
