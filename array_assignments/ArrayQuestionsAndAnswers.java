package array_assignments;

public class ArrayQuestionsAndAnswers {

	public static void main(String[] args) {
//		 String[] c=new String[0];
//		 System.out.println(c.length);
		
		String[] c =new String[] { "abc"};
		System.out.println(c[0].length());
		 String[] s=new String[] {"abc"};
		 System.out.println("s[0]" + "d");
		 
		 System.out.println();
		 
		 
		 double[] nums= new double[] {9,0.5,3,4,6,5,1.5};
		 double smallest =nums[0];
		  for(double n: nums) {
			  if(n>smallest) {smallest=n;}
			  
		  }
		  System.out.print(smallest);
		  
		  System.out.println();
		  
		  int[]  x=new int[] {111,222,016};
		  for(int z:x) {
			  System.out.print(z + " ");
			  
			  
			  
			  String[] r=new String[3];
			  //r=new String[4];
			  
			  //System.out.print(Array.toString(new int [] {1,2,3}));
		  }
		  
		  String b="abcdefg";
		  for(int i=0; i<=b.length()-1; i++) {
			  System.out.println(b.charAt(i));
		  }
		  
		  
		  String[] num1=new String[] { "1","2","3","4"};
		  num1[2]="0";
				 
		  System.out.println(num1[2]);
		  
		  
		  System.out.println();
		  String []fruits= new  String[] {"apple", "melon" ," banana"};
		  String print =fruits[0];
		  for(String f:fruits) {
			   if(f.length()>print.length()) {
				   print =f;
			   }
		  }
		  System.out.print(print);
		   
		  
		 
		
		  
              

	

}
}
