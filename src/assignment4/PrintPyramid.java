package assignment4;

import java.util.Scanner;

public class PrintPyramid {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("# of rows in your pyramid");
		int noOfRows = sc.nextInt();
		System.out.println("Here is your pyramid");
		for (int i = 1; i <=noOfRows;  i++){
			for (int j=0; j<=noOfRows-i; j++){
				System.out.print(" ");
			}
			for (int j=0; j<i; j++){
				int num = 1+i*(i-1)/2+j;
				System.out.print(num + " ");
			}
			System.out.println();

		}


	}
	
}
