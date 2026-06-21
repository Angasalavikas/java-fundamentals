package com.java.array;

public class AverageOfArray {
    static void main() {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        for(int i = 0;i < arr.length;i++){

            sum += arr[i];

        }
        double average =  sum / arr.length;
        System.out.println("average: " + average);
    }
}
