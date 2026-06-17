package com.java.array;

public class LargestArrayElement {
    static void main() {
        int[] arr = {10, 20, 30, 40, 50};
         int largest = arr[0];
         for(int i = 1;i < arr.length;i++){
             if(arr[i] > largest){
                 largest = arr[i];
             }
         }
        System.out.println("largest element: " + largest );
    }
}
