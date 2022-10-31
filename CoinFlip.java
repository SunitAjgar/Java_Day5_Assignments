package com.blz.day5;

import java.util.Scanner;

public class CoinFlip {
	  public static void main(String[] args) {
	    System.out.println("Enter the number of times to flip a coin ");
	    Scanner sc = new Scanner(System.in);

	    int numTimes = -5;
	    do {
	      numTimes = sc.nextInt();
	      if (numTimes < 0) {
	        System.out.println("Thats not valid. Enter again ");
	      }

	    } while (numTimes < 0);

	    byte headCount = 0;
	    byte tailCount = 0;

	    for (int i = 0; i < numTimes; i++) {
	      float random = (float) Math.random();
	      if (random < 0.50) {
	        System.out.print("T ");
	        tailCount++;
	      } else {
	        System.out.print("H ");
	        headCount++;
	      }
	    }

	    System.out.println("\n");
	    System.out.println("Heads percent " + ((float) headCount / numTimes) * 100);
	    System.out.println("Tails percent " + ((float) tailCount / numTimes) * 100);
	    sc.close();
	  }
	}
