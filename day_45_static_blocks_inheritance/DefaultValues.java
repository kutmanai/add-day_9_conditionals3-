package day_45_static_blocks_inheritance;

public class DefaultValues {
	public int intValue;
	public byte byteValue;
	public double doubleValue;
	public boolean booleanValue;
	public char charValue;
	public String stringValue;//null
	public Integer integerObject;//null
	
	
	public static void main(String[] args) {
		//System.out.println(intValue); in is not compile
		DefaultValues d= new DefaultValues();
			System.out.println(d.intValue);
			
			System.out.println(d.byteValue);
			System.out.println(d.doubleValue);
			System.out.println(d.charValue);
			System.out.println(d.stringValue);
			System.out.println(d.integerObject);
			
			System.out.println(d.intValue +101);
			//System.out.println(d.stringValue.toUpperCase());//nullPointException
		
		     d.stringValue="Hello World!";
		     System.out.println(d.stringValue.toUpperCase());
		     
	}


}
