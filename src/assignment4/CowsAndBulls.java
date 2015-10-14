package assignment4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {
	
		
	public static void main(String[] args){
		Random randomGenerator = new Random();
		int number = 0;
		while(numberGuessed(number=(randomGenerator.nextInt(8999)+1000)));
		String numberStr = number + "";
		boolean guess= false;
		Scanner sc =new Scanner(System.in);
		int timeOfGuesses=0;
		do{
			int bulls=0;
			int cows=0;
			System.out.println("Guess a number with 4 digits and no duplication:");
			int guesses;
			try{
				guesses=sc.nextInt();
				if(numberGuessed(guesses) || guesses <1000) continue;
			}catch(InputMismatchException e) {
				continue;
			}
			timeOfGuesses++;
			String guessesStr = guesses + "";
			for (int i=0; i<4;i++){
				if(guessesStr.charAt(i) == numberStr.charAt(i)){
					bulls++;
				}else if (numberStr.contains(guessesStr.charAt(i)+"")) {
					cows++;
				}
			}
			if(bulls ==4){
				guess=true;
			}else{
				System.out.println(cows + " Cows and "+ bulls+" Bulls.");
			}
		}while(!guess);
		System.out.println("You won after "+ timeOfGuesses+ " times.");
	}

	public static boolean numberGuessed(int num){
		boolean[] digs=new boolean [10];
		while (num > 0) {
			if (digs[num%10]) return true;
			digs[num%10] = true;
			num/=10;
		}
		return false;
	}

}
