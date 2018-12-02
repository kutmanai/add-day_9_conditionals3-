package day_25strint_arrays;

public class KitchenItemsWithArrays {

	public static void main(String[] args) {
		  
		String[]kitchenItems= { "knife","woodenspoons","plates","cups" , "forks","pan",
			      "pot","trashcan", "fridge","dishwasher"};
		//Can we add another item to kitchenItems array later on in our code
		/*
		 * 
		 * Using a for each loop iterate through each item:
		 * within your each loop:
		 */
		
		
		for(String item:kitchenItems) {
			switch(item.toLowerCase()) {
			case "knife":
				System.out.println("knife is used for cutting veggies");
				break;
				
			}
		}


	}

}
