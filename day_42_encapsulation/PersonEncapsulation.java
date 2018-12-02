package day_42_encapsulation;

public class PersonEncapsulation {

	public static void main(String[] args) {
		 Human p = new Human();
		 p.setAge(100);
		 System.out.println(p.getAge());
		 p.setGender("female");
		 System.out.println(p.getGender());
		 
		 Human p2= new Human();
		 System.out.println(p.todaysDate);
		 p2.todaysDate="November, 6 2018";
		 System.out.println(p2.todaysDate);
		 System.out.println(Human.todaysDate);
		 Human.todaysDate="Nov 8,2019";
		 System.out.println(Human.todaysDate);
	}

}
