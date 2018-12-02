package repl_it_assignments;

public class StringMethod {

	public static void main(String[] args) {
		cut("ObOma",2);
		
	}
	public static  void cut (String  word, int size ) {
		
		String s=word.substring(size);
		System.out.println(s);
	}

}
