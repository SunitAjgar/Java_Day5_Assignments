package com.blz.day5;

import java.util.Scanner;

public class LeapYear {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a year to check if its Leap Year ");
	    int year = 2000;
	    do {
	      year = sc.nextShort();
	      if ((float) year / 1000 < 1) {
	        System.out.println("year must be of four length. Enter again ");
	      }
	    } while ((float) year / 1000 < 1);
	    sc.close();

	    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	      System.out.println("\nLeap Year");
	    } else {
	      System.out.println("\nNot a Leap Year");
	    }

	  }
	}