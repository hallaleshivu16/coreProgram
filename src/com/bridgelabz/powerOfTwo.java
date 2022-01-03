package com.bridgelabz;

import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power for 2");
        int num = sc.nextInt();
        int power = 1;
        int i = 0;

        if(num < 31 && num >= 0) {
            while (i < num)
            {
                power = power * 2;
                i++;
            }
        }
        System.out.println("2^"+num+" is="+power);
    }
}
