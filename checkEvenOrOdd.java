package com.blz.day5;

import java.util.Scanner;

public class checkEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("the number is even");
		} else {
			System.out.println("the number is odd");
		}
	}
}
