package assignment4;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	// why in your program I can still continue to guess when you print out "I have 0 chances to try"?
	public static void main(String[] args){
		Random randomGenerator = new Random();
		int i = randomGenerator.nextInt(99)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please guess a number between 1 and 100 - You have 5 chances to guess");
		int guessedNumber= sc.nextInt();
		int usedChance =1;
		while(usedChance <= 5 && guessedNumber != i) {
			if (guessedNumber > i){
				System.out.println(guessedNumber + " is greater than what I've guessed - You have " + (5-usedChance) + " chances to guess");
				guessedNumber= sc.nextInt();
			}else if (guessedNumber < i){
				System.out.println(guessedNumber + " is less than what I've guessed - You have " + (5-usedChance) + " chances to guess");
				guessedNumber= sc.nextInt();
			}else{
				System.out.println("Congratulations! You've guessed it right and you guessed it in "+ usedChance + " chances..." );
			}
			usedChance++;
			
		} 
		if (guessedNumber == i) {
		    System.out.println("Congratulations! You've guessed it right and you guessed it in "+ usedChance + " chances...");	
		} else {
		    System.out.println("You are out of chances! The correct answer is " + i);	
		}
	
	}
	
}
		
		


