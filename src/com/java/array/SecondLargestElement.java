package com.java.array;

public class SecondLargestElement {
    static void main() {
        int[] arr = {2,24,443,435,4334,43523};
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("second element: " + secondLargest);
    }
}
