package com.java.array;

public class SmallestArrayElement {
    static void main() {
        int[] arr = {48, 59,4950,5994,5894};
        int smallest = arr[0];
        for( int i = 1;i < arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("smallest element: " + smallest);
    }
}
