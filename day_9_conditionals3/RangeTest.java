package day_9_conditionals3;

public class RangeTest {

	public static void main(String[] args) {
	int students =60;
	if (students >= 5  && students <=30 ) {
		System.out.println(" lets do mentoring session ");
	} else if (students >= 30 && students <=60) {
		
		System.out.println("lets have a lecture");	} 
	else if (students>60) {
		int online=students-60;
	System.out.println( online + " students need to take class online? ");
} else {
	System.out.println(" Students need to be more than equal to 5? ");
}

	}
	

}
