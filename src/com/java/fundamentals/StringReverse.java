package com.java.fundamentals;

import java.util.Scanner;

public class StringReverse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = sc.nextLine();
        String reverse = " ";
        for (int i = str.length() - 1; i >= 0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("String reverse :" + reverse);
        sc.close();
    }
}