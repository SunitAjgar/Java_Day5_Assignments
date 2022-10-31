package com.blz.day5;

import java.util.Scanner;

public class PrimeFactors
{
    public static void primeFactors(int num){
        while (num%2==0){
            System.out.print(2 + " ");
            num /= 2;
        }
        for (int i = 3; i * i <= num; i+= 2)
        {
        while (num % i == 0){
        System.out.print(i + " ");
        num /= i;
        }
     }
        if (num > 2)
        System.out.print(num);
     }
 
       public static void main (String[] args)
        {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number");
        int num = sc.nextInt();
        primeFactors(num);
    }
}
