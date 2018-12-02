package day_40_classes_objects;

public class ComparinStringBuilders {

	public static void main(String[] args) {
		
  StringBuilder builder1= new StringBuilder("java");
  StringBuilder builder2= new StringBuilder("java");
  
  System.out.println(builder1==builder2);//false
  System.out.println(builder1.equals(builder2));//false
  
  //How do we compare?
  
  //Convert to String then call's equals method
  
  boolean isEqual=builder1.toString().equals(builder2.toString());
  System.out.println(isEqual);
  StringBuilder builder3=builder1;
  System.out.println(builder3==builder1);
  System.out.println(builder1);
  System.out.println(builder3);
  builder3.append(" programming");
  System.out.println(builder1);
  System.out.println(builder3);
  
  StringBuilder builder4 =new StringBuilder(builder1);
  System.out.println(builder4);
  
  builder1.append("!!!");
  System.out.println(builder4);
  System.out.println(builder1);
  
  
  
  
  
  
  
  
  
  

	}

}
