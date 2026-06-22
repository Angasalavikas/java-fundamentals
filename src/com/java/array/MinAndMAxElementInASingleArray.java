package com.java.array;

public class MinAndMAxElementInASingleArray {
    static void main() {
        int[] arr = {10,20,30,40,50,60};
        int min = arr[0];
        int max = arr[0];
        for(int i = 0;i < arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(" max array Element: " + max);
        System.out.println("min array element: " + min);
    }
}
