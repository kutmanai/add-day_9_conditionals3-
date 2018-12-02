package day_6_operators_boolena;

public class IncremnetDecrementOperators {

	public static void main(String[] args) {
		int windowsComputers = 35;
		windowsComputers++;
		windowsComputers++;
		System.out.println(windowsComputers);
		windowsComputers= windowsComputers + 1;
		windowsComputers += 1;
		System.out.println(windowsComputers);
		
		int unreadMessages =50;
		System.out.println("Unread messages: " + unreadMessages);
		System.out.println("Reading   one message");
		 unreadMessages --;
		 unreadMessages --;
		 System.out.println("Unread messages:" + unreadMessages);
	}

}
