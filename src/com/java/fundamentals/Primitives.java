package com.java.fundamentals;

import java.util.Scanner;

public class Primitives {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ID: 47377");
        int ID = sc.nextInt();
        System.out.println("enter age: 30");
        byte age = sc.nextByte();
        System.out.println("enter grade: A");
        char grade = sc.next().charAt(0);
        System.out.println("enter salary: 20000");
        double salary = sc.nextDouble();
        System.out.println("enter mobile number: 9100212550");
        long mobileNumber = sc.nextLong();
        System.out.println("enter the year: 2202");
        short year = sc.nextShort();
        System.out.println("Is Active (True/False): ");
        boolean isActive = sc.nextBoolean();
        System.out.println("\n ........employee Details......");
        System.out.println("ID: " + ID);
        System.out.println("age: " + age);
        System.out.println("grade: " + grade);
        System.out.println("salary: " + salary);
        System.out.println("mobileNumber: " + mobileNumber);
        System.out.println("year: " + year);
        System.out.println("Is Active: " + isActive);
        sc.close();

    }
}
