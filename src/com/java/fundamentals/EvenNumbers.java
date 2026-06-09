package com.java.fundamentals;

import java.util.Scanner;

public class EvenNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int N = sc.nextInt();
        //int sum = 0;
        System.out.println("print sum all even number:");
        for(int i = 0;i <= N;i++){
            if(i % 2 != 0){
                //sum = sum + i;
                System.out.println(i);
            }
        }
    }
}
