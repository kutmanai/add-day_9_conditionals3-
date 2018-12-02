package mentoringsession;

public class GetPrimeNumbers {

	public static void main(String[] args) {
		
//Find all the prime numbers between 60 and 90
		//60 and 90
		//60 61 62 63 .......    87 88 89 90
		//no  yes no
		for(int i =60; i<=90; i ++) {
			for(int j =2; j<i; j++) {
				if(i%j==0) {
					
				}
					break;
			}
			//if(j==(i-1)) {
				//PrimeNumber
				System.out.print( i+ " ");
			}
		}
		
		
		
		
	}


