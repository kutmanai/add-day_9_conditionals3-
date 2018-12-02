package mentoringsession;

import java.util.Arrays;

public class ZombieAtack1 {

	public static void main(String[] args) {
		
				  int [] cities= new int[] {3,6,0,4,3,2,7,1};
				int peopleAlive;
				 int days =0;
				 int numberiterations=0;
				 
				do{
				peopleAlive=0;

			
				System.out.println("Day:"+days+" "+Arrays.toString(cities));
				
				for( int i =0; i<cities.length; i++){
					peopleAlive+=cities[i];
				cities[i]=cities[i] /2;
				numberiterations++;

				}
				numberiterations++;
				
				days++;
				}while (peopleAlive>0);
				System.out.println(numberiterations);

	}

}
