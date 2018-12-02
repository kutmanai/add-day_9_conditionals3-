package day_42_encapsulation;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a= new Apple();
		a.setColor ("red");
		
		a.size=23;
		
		System.out.println(a.getColor());
        System.out.println(a.size);

		
		
	}

}
