package com.java.strings;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length()- 1;i >= 0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else
        {
            System.out.println("Not palindrome");
        }
    }
}
