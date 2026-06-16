package com.java.strings;

import java.util.Scanner;

public class CountVowelConsonants {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        int vowelsCount = 0, consonantsCount = 0,digitsCount = 0,specialsCount = 0;
        for(int i = 0;i < str.length();i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digitsCount++;
            }else {
                specialsCount++;
            }
        }
        System.out.println("count of vowels: " + vowelsCount);
        System.out.println("count of consonants: " + consonantsCount);
        System.out.println("count of digit: " +  digitsCount);
        System.out.println("count of special:" + specialsCount);
    }
}
