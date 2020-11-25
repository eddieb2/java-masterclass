package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
	    scanner.nextLine();

	    int[] arr = readIntegers(count);
	    System.out.println(Arrays.toString(arr));

        int min = findMin(arr);
        System.out.println("The minimum value is = " + min);
    }

    public static int[] readIntegers(int num) {
        System.out.println("Please enter " + num + " numbers.");

        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static int findMin(int[] array) {
        // sort & return index 0
        Arrays.sort(array);
        return array[0];
    }
}
