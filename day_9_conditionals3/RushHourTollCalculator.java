package day_9_conditionals3;

public class RushHourTollCalculator {

	public static void main(String[] args) {
		//normal hours 
		
		/* 0-100 -5$
		 * 101-500-8$
		 * 501-1000-10$
		 * more than 1000-12$
		 * 
		 * 
		 */
	 boolean isRushHour = false;
	int miles =200;
	double tollCost= 0.0;
	
	
	if (miles > 0 && miles <=100) {
	 if (isRushHour==true) {
			tollCost =10.0;
		} else {
			tollCost = 5.0;
			
		} 
	 
	}else   if  (miles > 0 && miles <=100){
			if (isRushHour==true) {
				tollCost =10.0;
				
			} else {
				tollCost = 8.0;
				
			} 
	}
			
			else if (miles >=101 && miles <=500) {
				if (isRushHour==true) {
					tollCost=17;
				} else {tollCost =10;
					
				}
			}
	
		 if (miles>=501 && miles<=1000) {
			if (isRushHour==true) {
				tollCost =20;
			}
			
			
		} else { tollCost =15;
		
		
			}
		
		

		
	System.out.println("Toll Cost " + tollCost);

	

}
}

