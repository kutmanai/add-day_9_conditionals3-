package repl_it_assignments;

public class MethodSimplePrintPattern {

	public static void main(String[] args) {
		String stars=" *";
		printHollowRect(stars);
		

	}
	public static void printHollowRect(String star) {
		String str =" ";
		for(int row=0; row<=5; row++) {
			for(int col=0; col<5; col++) {
				if(row==0 || row==4) {
					str += " *";
				}else if(row==1 || row==2 ||row==3) {
					if(col==1) {
						if(row==0 || row ==5);
						str += " *";
					}
				}
			}System.out.println(star);
		}
		//System.out.println(star);
	}

}
