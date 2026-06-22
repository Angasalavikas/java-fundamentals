package com.java.array;

public class ReverseOfArrayWithoutAnotherArray {
    static void main() {
        int[] arr = {10,20,30,40,50,60};
        int start = 0;
        int end = arr.length-1;
        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int num : arr){
            System.out.println(num + "");
        }
    }
}
