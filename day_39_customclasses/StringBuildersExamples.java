package day_39_customclasses;

public class StringBuildersExamples {

	public static void main(String[] args) {
		 StringBuilder stb1= new StringBuilder("Halloween");
		 System.out.println(stb1);
		 
		 
		 StringBuilder stb2= new StringBuilder();
		 //stb2 +//++ operator will not work with stringBuilder
		 stb2.append("java");
		 System.out.println(stb2);
		 stb2.append(" SQL" + ",C#").append(",HTML");
		 System.out.println(stb2);
		 
		 StringBuilder listBuilder = new StringBuilder("Wooden");
		 listBuilder.append(" ,Iron Spoon ");
		 System.out.println(listBuilder );
		 
		 listBuilder .append('|');
		 System.out.println(listBuilder );
		 listBuilder .append(100);
		 System.out.println(listBuilder );
		 
		 String s=" aaa";
		 s= s+100;
		 s=s+true;
		 s=s+'%';
		 System.out.println(s);
		 
		 StringBuilder letters= new StringBuilder(" ABNDHKJHFJHOHO");
		 letters.append(" KKK WW");
		 System.out.println(letters);
		 letters.delete(0, 4);
		 System.out.println(letters);
		letters.delete(5, 100);
		System.out.println(letters);
		
		StringBuilder sentence = new StringBuilder("Java is fun");
		sentence.reverse();
		System.out.println(sentence);
		sentence.deleteCharAt(0);
		System.out.println(sentence);
		
		sentence.deleteCharAt(sentence.length()-1);
		System.out.println(sentence);
		
		StringBuilder  stbInsert= new StringBuilder("SeleniumAutomation");
		
		//SeleniumAutomation+> Selenium test automation
		stbInsert.insert(8, " test ");
		System.out.println(stbInsert);
		stbInsert.insert(9, 1);
		System.out.println(stbInsert);
		//Appium test Automation 
		stbInsert.replace(0,  stbInsert.indexOf(" "),"Appium");
		System.out.println(stbInsert);
		
		 
		String str2 ="aaabbbbjj";
		str2=str2.replace("aa","mm");
		System.out.println(str2);
		
		StringBuilder stb = new StringBuilder();
		
		
		 
		 
		 
	}

}
