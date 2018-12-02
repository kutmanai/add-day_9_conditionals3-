package array_assignments;

public class UtopinaTree {

	public static void main(String[] args) {
		 int[] growth= {-1,0,1,2,1,0,2,0,2,1};
		 
		 /* Standard growth is 1 cm per year , if the tree is 3 years old or younger
		  * otherwise , growth is 2 cm per year
		  * Additional factors affecting growth are in growth array
		  * 
		  * 
		  */
		 
		 int treeHeight=0;
		 for(int i =0; i<growth.length; i++) {
			 // make the tree grow
			 if(i<=2) {
				 treeHeight=treeHeight +1;
				 System.out.println("Year " + (i+1) + "growth 1 cm");
			 }else {
				 treeHeight=treeHeight+2;
				 System.out.println("Year " + (i+1) + "growth 2 cm");
			 }
			 System.out.println(" Tree size " +treeHeight + " cm\n") ;
			 
		 }
		 
		

	}

}
