package mentoringsession;

public class ScoreBoard {

	public static void main(String[] args) {
		
		/*
		 *  A*****
		 *  B***
		 *  C******
		 *  
		 *  Array for teams
		 *   needs 3 variable for each team score
		 *   int teamA=5;
		 *   int teamB=50;
		 *   int teamC=5;
		 * 
		 * create an array of chars A B C
		 * aasign scores for teams
		 * use for each loop to go  over each team
		 * check which team it is and find out how many start need to be printed
		 * use for loop prints starts
		 */
		
		int teamA=9;
		int teamB=15;
		int teamC=10;
		 char [] teams= {'A','B','C'};
		 
		 for(char  team : teams) {
			 int scores=0 ;
			 
			 if(team=='A') {
				 scores=teamA;
				 System.out.print(" A");
			 }else if (team=='B') {
				 scores=teamB;
				 System.out.print(" B");
			 }else if(team=='C') {
				 scores=teamC;
				 System.out.print(" C");
			 }
			 for (int star =1; star <=scores; star++) {
				 System.out.print(" *");
			 }
			 System.out.println();
		 }
		
		
		

	}

}
