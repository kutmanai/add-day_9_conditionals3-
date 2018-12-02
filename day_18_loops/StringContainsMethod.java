package day_18_loops;

public class StringContainsMethod {

	public static void main(String[] args) {
		String garage="Toyota,Nissan,Honda,BMW,Mazerati,Ford";
	garage=	garage.toLowerCase();
		System.out.println(garage);
		if(garage.isEmpty()) {
						
			System.out.println("No cars in garage");
		
			} //
		// contains
		if(garage.contains("toyota") || garage.contains("nissan")) {
			System.out.println("There is a Japanese car");
		} else {
			System.out.println("No Japanese cars");
		}

		if(garage.indexOf("bmw") >-1) {
			System.out.println("there is a german car in garage");
		}else {
			System.out.println("no german cars");
			
		}
		 if(garage.contains("jaguar")) {
			 System.out.println(" There is no British car in garage");
		 }else {
			 System.out.println("no british cars");
		 }
		 		
		 	
			
		String str="Java is fun";
		//whenever indexof finds the string , it gives a 0 or  a possitive index number
		System.out.println(str.indexOf("is")); //5
		//Whenever indexof cannot find  the string, it gives us -1
		System.out.println(str.indexOf("this"));
	}

}
