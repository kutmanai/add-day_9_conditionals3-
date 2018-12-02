package day_34_method_overloading;

public class Loremlpsum {
	
//	Method name: doesContain
//	Return type: boolean
//	Accepts a String as parameter
//	Returns true or false
//	Condition: Check if the third sentence contains the word “massa”
//	(or a word specific for your lorem ipsum)
//	Output should be; true or false

	public static void main(String[] args) {
		String sentence= " PlaceHolder: Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
				+"sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
				+"Risus in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut. Quisque non tellus orci ac."
				+"In nisl nisi scelerisque eu ultrices vitae auctor eu augue.";
			 System.out.println(doesContain(sentence));	
				
		
	}
	public static boolean doesContain(String str) {
		String [] splitIpsum=str.split("\\.");
		String thirdSentence=splitIpsum[2];
		
		
			if(thirdSentence.contains("massa")) {
				return true;
			}else {
				return false;
			}
		
		
		
		
	}
	

}
