package day_25strint_arrays;

public class WarmUpTaskArray {

	public static void main(String[] args) {
		
     /* Create in Array kitchen items
      * knife,wooden spoons,plates,cups , forks,pan
      * pot,trash can, fridge,dishwasher
      * Using for each loop iterate through each item:
      * within your  for each loop:
      * have a switch statement
      * switch(item){
      * case "knife":
      * Print "knife is  used for cutting
      * veggies":
      * break;
      * 
      */
		
		  
		
		  String[] kitchen={"knife","woodenspoons","plates","cups" , "forks","pan",
			      "pot","trashcan", "fridge","dishwasher"};
		    for (String kitchenItems:kitchen) {
		    	 switch(kitchenItems) {
		    	 case "knife":
		    		 System.out.println(" knife used for cutting");
		    		 break;
		    	 case "woodenspoons":
		    		 System.out.println(" spoon userfor for eat the food");
		    		 break;
		    	 case "plates":
		    		 System.out.println("used for to the food");
		    		 break;
		    	 case "cups":
		    	 		System.out.println("cups used for to drink a water");
		    	 		break;
		    	 case "forks":
		    		 System.out.println("forks for eat the food");
		    		 break;
		    	 case "pan":
		    		 System.out.println("to cook the food");
		    		 break;
		    	 case "pot":
		    		 System.out.println("pot for  to drink the tea");
		    	 case "trashcan":
		    		 System.out.println("to put a trash");
		    		 break;
		    	 case "fridge":
		    		 System.out.println(" tofreeze the food");
		    		 break;
		    	 case "dishwasher":
		    		 System.out.println(" to wash a dishes");
		    		 break;
		    		 
		    		 default:
		    		 System.out.println(" print nothing");
		    		 
		    		 break;
		    	 }
		    	   
		    	 
		    	
		    }
		    
		    
		 
		
		
	}
	
	

}
