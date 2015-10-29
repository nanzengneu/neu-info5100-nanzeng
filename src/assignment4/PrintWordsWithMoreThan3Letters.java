package assignment4;

import java.util.Scanner;

// where is your junit?
// if you input the example given by Prof., can you get the correct answer?
// "Java is a cool OOP. It doesnt have multiple inheritance"
// you do not ignore punctuation, ignored empty space only.
public class PrintWordsWithMoreThan3Letters {
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Please type your sentence here:");
		String sentence = sc.nextLine();
		sentence=sentence+" ";
		int space=0;
		String[] eachWord=new String[sentence.length()];
		while (sentence.length()!=0){
			int i = sentence.indexOf(" ");
			eachWord[space]=sentence.substring(0,i);
			sentence=sentence.substring(i+1);
			space++;
		}
		
		System.out.println("Here are the words with more than 3 letters:");
		for (int j=0; j<=space-1; j++){
			if (eachWord[j].length()>3){
				System.out.println(eachWord[j]);
			}
		}
	}
		
	
}
