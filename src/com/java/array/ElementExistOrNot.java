package com.java.array;

public class ElementExistOrNot {
    static void main() {
        int[] arr = {10,43,35,43,34};
        int key = 35;
        boolean found = false;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == key){
                found = true;
                break;
            }
        }if(found) {
            System.out.println("element found");
        }else{
            System.out.println("Not elemment found");
        }
    }
}
