package com.bridgelabz;

import java.util.Scanner;

public class largestOFThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find the largest number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        findindLargestNumber(num1,num2,num3);  // function calling
    }
    static void findindLargestNumber(int num1, int num2, int num3) {
        int max;
        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num1 && num3 > num2) {
            max = num3;
        } else {
            max = num1;
        }
        System.out.println("The largest number is: " +max);
    }
}
