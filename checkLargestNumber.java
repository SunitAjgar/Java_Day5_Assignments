package com.blz.day5;

import java.util.Scanner;

public class checkLargestNumber {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("To calculate largest number among 3  numbers");
     System.out.println("Enter any 3 integers");
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();
     int num3 = sc.nextInt();
     int large = (num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3));
     System.out.println("Largest number among 3 numbers is :  "+large);
	}
}
