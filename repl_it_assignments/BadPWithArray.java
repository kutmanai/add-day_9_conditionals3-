package repl_it_assignments;

public class BadPWithArray {

	public static void main(String[] args) {
		
		 int []num= {34,56,78,90,98,87};
		 int n=0;
		 badP(num,n);
		 System.out.println(badP(num,n));

	}
	
	public static boolean badP(int[] products,int limit)
	  {
	     
	      int [] newArray= new int[products.length];
	      int counter =0;
	      for(int i=0; i<products.length; i++){
	         newArray[i]+=counter;
	         counter++;
	         if(counter==limit){
	           newArray[counter]=i;
	           return false;
	         }
	         
	      }
	      return true;
	      

}
}
