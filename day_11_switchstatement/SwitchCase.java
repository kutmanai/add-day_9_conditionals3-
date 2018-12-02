package day_11_switchstatement;

public class SwitchCase {

	public static void main(String[] args) {
		//1-lobby,2-google,3-cybertek,4-apple
		int floor=1;
		if(floor==1) {
			System.out.println("lobby");
		}else if (floor==2) {
			System.out.println("Google");
		}else if(floor==3) {
			System.out.println("Cybertek");
		}else if(floor==4) {
			System.out.println("Apple");
		} else {
			System.out.println("No Such Floor");
		}
		
		switch (floor) {
		case 1:
			System.out.println("Lobby");
			break;
		case 2: 
			System.out.println("Google");
			break;
		case 3:
			System.out.println("Cybertek");
			break;
		case 4:
			System.out.println("Apple");
			break;
		default:
			System.out.println("No such floor");
		}
	}
	
	

}
