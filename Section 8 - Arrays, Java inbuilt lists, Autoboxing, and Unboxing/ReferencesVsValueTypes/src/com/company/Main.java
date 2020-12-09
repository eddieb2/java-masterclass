package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue + "\n");

        anotherIntValue++;

        System.out.println("after change myIntValue: " + myIntValue);
        System.out.println("after change anotherIntValue: " + anotherIntValue + "\n");

        System.out.println("----------------------------------\n");

        // Two references pointing to the same array
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println();
        System.out.println("after change myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray: " + Arrays.toString(anotherArray) + "\n");

        modifyArray(myIntArray);

        System.out.println("after modification myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("after modification anotherArray: " + Arrays.toString(anotherArray) + "\n");

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
