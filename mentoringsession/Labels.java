package mentoringsession;

public class Labels {

	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		
//		CONSTRUCTION:
//			for(int i =1; i <=2; i++) {
//				//if(i==4) {
//					//continue CONSTRUCTION;
//				
//				//System.out.println(i);
//				
//				for(int j=1; j<=7; j++) {
//					if(j==3) {
//						break CONSTRUCTION;
//					
//					
//				}
//					System.out.println(j);
//				
//			}
//			}
		
		
		
		 int i =0;
		 OUTER:
			 while(i<=3) {
				 
				 while(i<2) {
					 System.out.println(i);
					 break OUTER;
				 }
			 }
	}
	

}

