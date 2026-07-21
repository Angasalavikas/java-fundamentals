package com.java.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    static void main(String[] args) {
        String str1 = "vikas";
        String str2 = "vikas";
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not an anagram");
        }
    }
}
