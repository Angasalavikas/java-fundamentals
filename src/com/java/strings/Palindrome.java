package com.java.strings;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String reverse = "";
        for(int i = str.length()-1;i >= 0;i--)
            reverse = reverse + str.charAt(i);
        if(str.equals(reverse)) {
            System.out.println("string palindrome");
        }
            else{
            System.out.println("string is not palindrome");

        }
    }
}
