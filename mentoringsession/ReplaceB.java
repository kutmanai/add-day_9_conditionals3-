package mentoringsession;

public class ReplaceB {

	public static void main(String[] args) {
		
   String words[]= { "Bananas","Blueberries", "Cherries",
		   "Brocolli", "Butternet", "Squash", "Green bean", "Peanut"
		   
   };
   
    for (int i =0; i <words.length; i++) {
    	
    	words[i]= words[i].replace("B", "V").replaceFirst("b", "v");
    	//words[i]= words[i].replace("b,","v");
    }
    	
    	for(String word: words){
    	System.out.print(word + " ,");
    }
    
		
	}

}
