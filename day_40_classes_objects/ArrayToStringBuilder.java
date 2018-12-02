package day_40_classes_objects;

public class ArrayToStringBuilder {

	public static void main(String[] args) {
		
		String[] words = new String[5];
		words[0]="coffee";
		words[1]="tea";
		words[2]="water";
		words[3]="juice";
		words[4]="milk";
		
		//create String builder
		
		StringBuilder wordsStb= new StringBuilder();
		//without loop if have fixed number of values in String[]
		wordsStb.append(words[0])
		.append(words[1])
		.append(words[2])
		.append(words[3])
		.append(words[4]);
		
		System.out.println(wordsStb);
		
		//add everything into stringBuilder using looop
		StringBuilder  wordBuilder= new StringBuilder();
		 for(String drink : words) {
			 wordBuilder.append(drink);
		 }
		 System.out.println(wordBuilder);
		
		
		
		
	}

}
