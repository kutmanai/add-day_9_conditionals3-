package day_21loops03;

public class FindUniqueChar {

	public static void main(String[] args) {
		/* accept a string and print only unique characters in the String
		 * speedlimit
		 * spedlimt
		 * 
		 */
		
		String word="AABCCDD";
		String unique="";
		//int i=word.length()-1;
		//String  letter=word.substring(beginIndex)
		
		for(int idx =0;idx<word.length(); idx++) {
			 //System.out.println(word.substring(idx, idx+1));
			
			if(!unique.contains(word.substring(idx,idx+1))) {
				unique+=word.substring(idx,idx+1);
				
			}
		}
		 System.out.println(unique);

	}

}
