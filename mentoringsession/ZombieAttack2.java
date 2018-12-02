package mentoringsession;

import java.util.Arrays;

public class ZombieAttack2 {

	public static void main(String[] args) {
		
		  int [] cities= new int[] {3,6,0,4,3,2,7,1};
			int peopleAlive;
			 int days =0;
			 int numberiterations=0;
			 
			do{
			peopleAlive=0;
//			for(int cityPopulation: cities){
//			peopleAlive +=cityPopulation;
//			numberiterations++;
			//}
		
			System.out.println("Day:"+days+" "+Arrays.toString(cities));
			
			//if(peopleAlive==0)break;
			for( int i =0; i<cities.length; i++){
				//peopleAlive+=cities[i];
				if(cities[i]==0) {
					if(i !=cities.length-1 && cities[i+1]==1) {
						i++;
			//cities[i -1]=cities[i]-1 /2;
						
						if(i==cities.length-1) {
							cities[i-1]=cities[i-1]/2;
						}
					}else if (i==0) {
						cities[i+1]=cities[i+1]/2;
					}else {
						cities[i-1]=cities[i-1]/2;
						cities[i+1]=cities[i+1] /2;
					}
						
			//numberiterations++;
				}
			}
			numberiterations++;
			
			days++;
			}while (peopleAlive>0);
			System.out.println(numberiterations);

		

 
	}

}
