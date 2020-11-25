package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] reversedArr = reverseArr1(arr);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArr) + "\n\n");


    }

    // O(n)
    public static int[] reverseArr(int[] arr) {
        int[] reversedArr = new int[arr.length];
        int count = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            reversedArr[count] = arr[i];
            count++;
        }

        return reversedArr;
    }

    // O(log(n))
    public static int[] reverseArr1(int[] arr) {
        int midPoint = arr.length / 2;
        int maxLength = arr.length - 1;

        for (int i = 0; i < midPoint; i++) {
            int temp = arr[i];
            arr[i] = arr[maxLength - i];
            arr[maxLength - i] = temp;

        }

        return arr;
    }
}