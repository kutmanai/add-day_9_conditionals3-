package day_34_method_overloading;

public class GoogleAcountCount {

	public static void main(String[] args) {
		String results="About, 1,180,000  result (0.74 seconds)";
		System.out.println(resultCount(results));
		
		
	}
	public static String  resultCount( String str) {
		String [] strSplit=str.split(" ");
		String resultWithComma=strSplit[1];
		
		String resultWithoutComma=strSplit[1].replaceAll(",", "");
		
		return resultWithoutComma;
		
		
	
		
	}

}
