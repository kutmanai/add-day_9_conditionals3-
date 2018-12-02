package day_14_stringmanipulation;

public class TrimExample {

	public static void main(String[] args) {
		//trim() deleted whitespace in the begining and end of the string
		//including tab and regular space
		//space can be only at the  ending or only at the end or in both sides
		//Everything will go
		String str= " blah       ";
		System.out.println(str);
		//console will print str without the space
		//but the value of the str does not change
		System.out.println(str.trim());
		//will print the str with space
		System.out.println(str.length());
		//chaining calling method one after another
		//chaining calling methods after another
		System.out.println(str.trim().length());
		
		str =str.trim();

	}

}
