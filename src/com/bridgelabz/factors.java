package com.bridgelabz;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factors");
        int num = sc.nextInt();
        primeFactors(num);
    }

    public static void primeFactors(int num) {
        System.out.println("prime factors of given numbers are :");
        for (int i=2; i<=num; i++) {
            while (num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
        }
    }
}
