package com.java.fundamentals;

import java.util.Scanner;
public class studentTotalMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sub1 marks: ");
        int sub1marks = sc.nextInt();
        System.out.println("enter the sub2 marks: ");
        int sub2marks = sc.nextInt();
        System.out.println("enter the sub3 marks: ");
        int sub3marks = sc.nextInt();
        System.out.println("enter the sub4 marks: ");
        int sub4marks = sc.nextInt();
        int total = sub1marks + sub2marks + sub3marks + sub4marks;
        System.out.println("total marks: " + total);

    }
}
