package day_34_method_overloading;

public class GoogleResultTime {

	public static void main(String[] args) {
		 String  sentence="About 1,180,000 results (0.47 seconds";
		System.out.println( resultTime(sentence));

	}
	public static String resultTime (String str) {
		String [] strSplit=str.split("\\(");
		String secondPart=strSplit[1]; //0,74 seconds
		String wopSecondPart=secondPart.replaceAll("\\)", "");
		
		return wopSecondPart;
		
	}
	

}
