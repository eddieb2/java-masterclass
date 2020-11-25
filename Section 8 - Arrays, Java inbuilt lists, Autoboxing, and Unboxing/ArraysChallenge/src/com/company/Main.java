package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] myArray = getIntegers(5);
        System.out.println("Unsorted Array = " + Arrays.toString(myArray));

        // Ascending Sort
        Arrays.sort(myArray, Collections.reverseOrder());

        System.out.println("Descending Sorted Array = " + Arrays.toString(myArray));
    }

    public static Integer[] getIntegers(int number) {
        System.out.println("Please enter " + number + " numbers. \r");
        Integer[] unsortedArray = new Integer[number];

        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = scanner.nextInt();
        }

        scanner.close();
        return unsortedArray;
    }

}






//    NOTES : SAME THING AS Arrays.toString(array)
//    public static void printArray(int[] array) {
//        String arrString = "[";
//
//        for (int i = 0; i < array.length; i++){
//            arrString += Integer.toString(array[i]);
//            if (i != array.length-1) {
//                arrString += ", ";
//            }
//
//            if (i == array.length-1) {
//                arrString += "]";
//            }
//
//        }
//
//        System.out.println(arrString);
//    }