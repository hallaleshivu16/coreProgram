package com.bridgelabz;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int year;
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");      // input year of 4 digit integer value
        year = sc.nextInt();

        while (year != 0) {
            year = year / 10;
//              System.out.println(year);
            counter++;
        }
        if (counter == 4) {
            if ((year % 400 == 0) && (year % 100 == 0) || (year % 4 == 0)) {
                System.out.println("It is a leap Year");
            } else {
                System.out.println("It is not a leap year");
            }
        }
        else {
            System.out.println("Please enter the 4 digit year");
        }
    }
}
