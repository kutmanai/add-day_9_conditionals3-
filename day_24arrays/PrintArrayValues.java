package day_24arrays;

public class PrintArrayValues {

	public static void main(String[] args) {
		// create an array cars and directly assign following values:
		//Audi,Porche,BMW, Toyota, Honda, Tesla, Dodge, Kia, Acura,Fiat
		
		    String[]cars= new String[]{"Audi","Porche","BMW", "Toyota",
		    		"Honda", "Tesla", "Dodge", "Kia" ,"Acura","Fiat","Moskvich", "Ferari","Cooper","Ford"};
		    System.out.println(cars.length);
		    
		    int i=0;
		    System.out.println(cars[i]);
		    i++;
		    System.out.println(cars[i]);
		    i++;
		    System.out.println(i);
		    //print all values using a for loop
		     for(int idx=0; idx< cars.length; idx++) {
		    	 System.out.println(cars[idx]);
		     }
		    	 
		    	 // print all values using a for Each loop
		    	
		     System.out.println("---- FOR EACH LOOP----");
		     for (String car:cars) {
		    	 System.out.println(car);
		     }
		     int[]nums= {4,6,3,1,4};
		     for(int n : nums) {
		    	 System.out.println(n);
		     }
		     
		     
  }
}
		 

	


