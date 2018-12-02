package day_18_loops;

public class WarmUpTaskStringManipulation {

	public static void main(String[] args) {
		
		String  SMSmessage = new String("Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}");
		String sender;
		String phoneNumber;
		String message;
	
		 sender=SMSmessage.substring(SMSmessage.indexOf("<")+1,SMSmessage.indexOf(">"));
	      phoneNumber=SMSmessage.substring(SMSmessage.indexOf("[")+1,SMSmessage.indexOf("]"));
		  message=SMSmessage.substring(SMSmessage.indexOf("{")+1, SMSmessage.indexOf("}"));
		   System.out.println(sender);
		   System.out.println(phoneNumber);
		   System.out.println(message);
	}

}
