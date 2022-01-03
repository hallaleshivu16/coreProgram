package com.bridgelabz;

import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers num1, num2");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        beforeSwap(num1,num2);
        afterSwap(num1,num2);

    }
    static void beforeSwap(int num1, int num2) {
        System.out.println("Before swapping: " + num1 + " " +num2 + " ");
    }
    static void afterSwap(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping: " + num1 + " " +num2 + " ");
    }
}
