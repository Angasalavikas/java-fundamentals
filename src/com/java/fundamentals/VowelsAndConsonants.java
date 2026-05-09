package com.java.fundamentals;

import java.util.Scanner;

public class VowelsAndConsonants {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String :");
        String str = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for ( int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
            System.out.println(" Number of Vowels = " + vowels);
            System.out.println("Number of Consonants = " + consonants);

        sc.close();
    }
}
