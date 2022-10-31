package com.blz.day5;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U')
		System.out.println(ch + " is vowel");
		else if
		((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character " +ch+ " is Consonent");
		else
	    System.out.println("Invalid Input : Enter a single character in Lower Case OR Uper Case");
	}
}
