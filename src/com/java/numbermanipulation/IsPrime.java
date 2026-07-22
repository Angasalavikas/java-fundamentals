package com.java.numbermanipulation;

import java.util.Scanner;

public class IsPrime {
    static void main() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = Scanner.nextInt();
        boolean isPrime = true;
        if(n <= 1){
            isPrime = false;
        }else{
            for(int i = 2;i <= Math.sqrt(n);i++){
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("prime number");
        }else{
            System.out.println("Not a prime number");
        }

    }
}
