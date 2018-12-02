package day_36_arraylist;

import java.util.ArrayList;

public class WarmUpTaskWithArrayList {

	public static void main(String[] args) {
		  /*
		   * 
		   *  print count og cities in the list
		   *  print all cities in one line separated by space
		   *  create another arrayList longnames and all all cities from cities  list with more than 6
		   *  
		   */
		
		 ArrayList <String>  cities= new ArrayList<>();
		 cities.add("Paris");
		 cities.add(" Berlin");
		 cities.add(" Pisttburgh");
		 cities.add(" Madrid");
		 cities.add(" Moscow");
		 cities.add(" Washington");
		 cities.add(" Kyrgyzstan");
		 cities.add(" Amsterdam");
		 cities.add(" Toronto");
		 cities.add(" London");
		 cities.add(" Instanbul");
		 
		 int countOfCities=cities.size();
		 System.out.println("Count of cities in the list:" + countOfCities);
		for( String city:cities) {
			System.out.print(city + " |");
			
		}
		System.out.println();
		//System.out.println(cities.get(11));
		 for (int  i=0; i<cities.size(); i++ ) {
			 System.out.print(cities.get(i) + "|");
		 }
		 
		 
		 ArrayList<String> longNames= new ArrayList<>();
		 System.out.println(longNames.size());
		 System.out.println( "It is empty? :" +longNames.isEmpty());
		   for(String city : cities) {
			   if(city.length()>6) {
				   longNames.add(city);
				   
				   
			   }
		   }
		   System.out.println(longNames);
		   longNames.clear();//clear the arraylist , it will become ampty like now
		 
		    System.out.println(longNames.isEmpty()+ " " + (longNames.size()==0));
		 
		    
		     for(int id=0; id<cities.size(); id++) {
		    	 String city =cities.get(id);
		    	 if(city.length()>6) {
		    		 longNames.add(city);
		    		 
		    		 
		    	 }
		     }
		     System.out.println("Cities count with > 6 chars:" + longNames.size());
		     System.out.println(longNames.toString());

	}

}
