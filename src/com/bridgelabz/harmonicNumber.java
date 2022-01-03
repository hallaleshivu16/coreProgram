package com.bridgelabz;

import java.util.Scanner;

public class harmonicNumber {
    public static void main(String[] args) {
        int num;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++ ) {
            System.out.println("1/"+i+"+");
            sum = sum + (double) 1/i;
        }
        System.out.println("Sum of Harmonic numbers is:" +sum);
    }
}
