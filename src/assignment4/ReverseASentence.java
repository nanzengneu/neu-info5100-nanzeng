package assignment4;

import java.util.Scanner;

public class ReverseASentence {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type your original sentence here:");
		String sentence= sc.nextLine();
		sentence=sentence+" ";
		int space=0;
		String[] eachWord=new String[sentence.length()];
		while (sentence.length()!=0){
			int i = sentence.indexOf(" ");
			eachWord[space]=sentence.substring(0,i);
			sentence=sentence.substring(i+1);
			space++;
		}
		
		String result="";
		for (int j= space-1;j>=0; j--){
			result=result+eachWord[j]+" ";
			
		}
		System.out.println("The reversed sentence is:");
		System.out.println(result);
	}

}
