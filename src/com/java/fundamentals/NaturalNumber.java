package com.java.fundamentals;

import java.util.Scanner;

public class NaturalNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value :");
        int num = sc.nextInt();
        System.out.println("print natural numbers:");
        for (int i = 0; i <=num; i++){
            System.out.println(i);
        }
    }
}
