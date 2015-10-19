package assignment4;

import java.util.Scanner;

// 1. your code will get null pointer exception when input is less than 6.
// 2. you do not need the array int[number], you can reduce the space complexity to O(1).
public class GenerateFibonacciNumber {
	
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Type your number here:");
		int number=sc.nextInt();
		System.out.println("The Fibonacci Number before "+ number+ ": ");
		int [] num = new int [number];
		num[0]=0;
		num[1]=1;
		int i=2;
		int nextNumber=num[0]+num[1];
		while (nextNumber<=number) {
			num[i]=nextNumber;
			nextNumber=num[i]+num[i-1];
			i++;
		}
		
		for(int j=0; j<i; j++){
			System.out.print(num[j]+ " ");
		}
		
	}

}
