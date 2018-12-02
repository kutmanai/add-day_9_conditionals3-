package repeattask;

public class PrintArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create on array cars and directly assign following values;
		 
		
		String [] cars= {"Audi","Porsche","BMW","Toyota","Dodge","Acura","Ford",
				"Kia","Ferrari","Cooper","Honda"};
		//print number of Cars
		System.out.println(cars.length);
		int i=0;
		System.out.println(cars[i]);
		i++;
		System.out.println(cars[i]);
		i++;
		System.out.println(cars[i]);
		//print all values using a for loop
		
		 for(int idx=0; idx<cars.length;idx++) {
			
			 System.out.println(cars[idx]);
			 
			 System.out.println("-----FOR EACH LOOP-----");
			 //print all values using a for Each loop
			 for(String carbrand: cars) {
				 System.out.println(carbrand);
			 }
		 }
		
	}

}
