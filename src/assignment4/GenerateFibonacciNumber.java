package assignment4;

import java.util.Scanner;

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
