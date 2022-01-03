package com.bridgelabz;

import java.util.Scanner;

public class quotientAndReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend value");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor value");
        int  divisor = sc.nextInt();
        System.out.println("Quotient: " + findQuotient(dividend,divisor));
        System.out.println("Remainder: " + findRemainder(dividend,divisor));
    }
    static int findQuotient(int dividend, int divisor) {
        return dividend / divisor;
    }
    static int findRemainder(int dividend, int divisor) {
        return dividend % divisor;
    }
}
