package com.blz.day5;

import java.util.Scanner;

public class HarmonicNumber {
		public static void main(String arg[]) {
		double sum = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		double num = sc.nextDouble();
		for(double i=1; i<=num; i++)
		{
			sum=sum+(1/i);
		}
		System.out.println("Harmonic value = :  "+sum);
		}
	}
