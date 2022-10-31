package com.blz.day5;

import java.util.Scanner;

public class PowerOf2 {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long num = 0;

	    System.out.println("Enter a number (0-31) ");

	    do {
	    	num = sc.nextShort();
	      if (num > 31 || num < 0) {
	        System.out.println("Thats not valid. Enter again a number between (0-31)");
	      }

	    } while (num > 31 || num < 0);
	    sc.close();

	    for (int i = 0; i <= num; i++) {
	      System.out.println("2 ^ " + i + " = " + (int) Math.pow(2, i));
	    }
	  }
	}
