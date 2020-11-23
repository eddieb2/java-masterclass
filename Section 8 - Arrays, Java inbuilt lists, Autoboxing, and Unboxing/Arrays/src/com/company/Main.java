package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // OPTION 1
	    int[] myIntArray = new int[10];
	    myIntArray[5] = 50;

        // OPTION 2
        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};

        // OPTION 3
        int[] myIntArray3 = new int[10];

        printArray(myIntArray);
        printArray(myIntArray2);
        printArray(myIntArray3);

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("Average = " + getAverage(myIntegers));
    }

    // Takes number input and adds to an array
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] =  scanner.nextInt();
        }

        return values;
    }

    // Finds the average of an array
    public static double getAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Index = " + i + ", Value = " + array[i]);
        }
        System.out.println("----------------------------------------");
    }
}
