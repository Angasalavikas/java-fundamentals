package com.java.fundamentals;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
       int N = sc.nextInt();
       int sum = 0;
       for(int i = 0;i <= N;i++){
           sum = sum +i;
       }
        System.out.println(sum);
    }
}
