package com.bridgelabz;

import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Alphabet to check whether it is a Vowel or Consonant");
        char alphabet = input.next().charAt(0);
        toCheckVowelOrConsonant(alphabet);
    }
    public static void toCheckVowelOrConsonant(char alphabet) {
        if ( alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println("The given alphabet is Vowel");
        } else if (alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
            System.out.println("The given alphabet is Vowel");
        } else {
            System.out.println("The given alphabet " +alphabet+ " is Consonant");
        }
    }
}
