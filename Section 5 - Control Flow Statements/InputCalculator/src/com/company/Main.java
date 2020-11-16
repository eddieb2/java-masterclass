package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;

        int count = 1;

        while (true) {
//            System.out.println("Enter a number: ");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                sum += number;

                avg = Math.ceil((double)sum / count);
                count++;

            } else {
                System.out.println("SUM = " + sum + " AVG = " + (int)avg);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
