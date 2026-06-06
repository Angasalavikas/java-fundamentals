package com.java.fundamentals;

import java.util.Scanner;

public class CountOfNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        long N = sc.nextLong();
        int Count = 0;
        while(N !=0) {
            N = N / 10;
            Count++;

        }
        System.out.println("print count:" + Count);
    }
}
