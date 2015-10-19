package assignment4;

import java.util.Scanner;

public class CapitalizeFirstLetter {
	
	public static String upperCaseFirst(String value){
		char[] array = value.toCharArray();
		array[0]=Character.toUpperCase(array[0]);
		for (int i=1; i<array.length; i++){
			if (Character.isWhitespace(array[i-1])) {
				array[i]=Character.toUpperCase(array[i]);
			}
		}
		return new String(array);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type your sentence here with all lower letters:");
		String sentence= sc.nextLine();
		String result = upperCaseFirst(sentence); 
		System.out.println(result);
		// why do you leave these space lines?
		
	
	}
	
	
	

}
