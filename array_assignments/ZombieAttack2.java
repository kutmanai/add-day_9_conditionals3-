package array_assignments;

import java.util.Arrays;

public class ZombieAttack2 {

	public static void main(String[] args) {
		
       int[]population = {3,6,0,4,3,2, 2,0};
       for ( int days =0; days<population.length; days ++) {
    	   while(population[days] >0) {
    		   for(int city =0; city<population.length;city++) {
    			    if(population[city]==0) {
    			    	if(city==0) {
    			    		population[city +1]=population[city+1]  /2;
    			    	}else if (city==population.length-1) {
    			    		population[city-1]=population[city-1] /2;
    			    	}else {
    			    		population[city +1]=population[city+1]  /2;
    			    		population[city-1]=population[city-1] /2;
    			    	}
    			    }
    		   }
    		   System.out.println(" Days"  + days+ " " + Arrays.toString(population));
    		   
    	   }
       }

	}

}
