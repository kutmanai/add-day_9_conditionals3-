package day_23looopsreview;

public class StringAreaCode {

	public static void main(String[] args) {
		 
              String phoneNumber=" (202)3334444";
               phoneNumber.startsWith("(");
               phoneNumber.endsWith(")");
              
                 String areaCode="";
                  String state=" Washington";
                
                switch(areaCode) {
                
                case "202":
                	state="Washington";
                	break;
                case "703" :
                	state="Virginia";
                	break;
                case "209" :
                	 state="California";
                	break;
                case "312":
                	state="Illinois";
                	break;
                case "347":
                	state=" New York";
                	break;
                	default:
                		System.out.println("Not in database");
                
                
                }
                System.out.println(phoneNumber +state);
                
	}

}
