package com.java.array;

public class CountEvenAndOddInArray {
    static void main() {
        int[] arr = {10,20,31,41,53,50};
        int even = 0;
        int odd = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
    }
}
