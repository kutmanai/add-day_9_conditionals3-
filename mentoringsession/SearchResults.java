package mentoringsession;

public class SearchResults {

	public static void main(String[] args) {
		
       String googleSearchResult="About 13,500,00 results (0.57 seconds)";
		// extract the count and print separately.
       String result[]= googleSearchResult.split(" ");
       
       System.out.println(result.length);
       System.out.println(result[1]);
       System.out.println(result[3].replace("(",""));
       
       String[] seconds=googleSearchResult.split("results");
       System.out.println(seconds.length);
       System.out.println(seconds[1]);
       //SPLIT method in Java.
       /* 1)what does it accept
        * 2) what does it do
        * 3)what does it return
        * 
        * 1) it accepts a delimiter/string by which you want the string to be splitted
        * String fruit="apples,bananas";
        * fruit.split(",)
        * 2) it will search for the delimiter/string in the whole string and will split each time
        * and form an array
        * apples
        * bananas
        * 3)it will return an array of strings
        * String fruit ="apples, bananas";
        * String[] aaFruit=fruit.split(",");
        * for(String fr: arrFruits){
        * System.out.println(fr);
        * SPLIT method takes a string and converts to an array of 
        * 
        * 
        */
       
       String tests="date;year;type;category;";
       String [] arrTests=tests.split(";");
       System.out.println(arrTests.length);
       for(String test: arrTests) {
    	   System.out.println("Performing test category :" +test);
       }
     
	}

}