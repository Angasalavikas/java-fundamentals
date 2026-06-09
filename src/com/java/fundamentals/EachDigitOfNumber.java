package com.java.fundamentals;

import java.util.Scanner;

public class EachDigitOfNumber {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value: ");
       int number = sc.nextInt();
       String str = String.valueOf(number);
       for(int i = 0;i <= str.length();i++){
           System.out.println(str.charAt(i));
       }
    }
}
