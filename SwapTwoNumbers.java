package com.blz.day5;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("The numbers after swapping are num1 : " +num1+  "  "  + "num2 : " +num2 );
	}
}
