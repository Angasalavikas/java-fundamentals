package com.java.fundamentals;

import java.util.Scanner;

public class MultiplicationOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int N = sc.nextInt();
        System.out.println("print multiplication:" + N);
        for(int i = 0;i <= 10;i++){
            System.out.println(N +"x" + i + "="+ (N * i));
        }
    }
}