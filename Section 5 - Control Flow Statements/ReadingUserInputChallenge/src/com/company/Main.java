package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sumInput();
    }

    public static void sumInput() {
        int sum = 0;
        int count = 1;

        Scanner scanner = new Scanner(System.in);

        while (count <= 10) {
            System.out.println("Enter #" + count + ": ");
            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                System.out.println("Invalid number.");
            } else {
                int number = scanner.nextInt();

                sum += number;
                count++;
            }
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Sum = " + sum);
    }

}
