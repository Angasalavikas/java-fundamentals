package com.java.array;

public class CopyOneToAnotherArray {
    static void main() {
        int[] arr = {10,20,30,40,50};
        int[] arr1 = new int[arr.length];
        for( int i = 0;i < arr.length;i++){

            arr1[i] = arr[i];
        }
        System.out.println("copy array");
        for(int i = 0;i < arr1.length;i++){
            System.out.print(arr1[i] + ",");
        }
    }
}
