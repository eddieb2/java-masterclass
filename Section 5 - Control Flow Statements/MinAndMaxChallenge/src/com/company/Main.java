package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        minAndMaxChallenge();
        minAndMaxChallengeSolution();
    }

    public static void minAndMaxChallenge() {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        int count = 1;

        while (count <= 2) {
            System.out.println("Enter number #" + count + ":");
            boolean isNumber = scanner.hasNextInt();

            if (isNumber) {
                if (count == 1) {
                    num1 = scanner.nextInt();
                    count++;
                } else {
                    num2 = scanner.nextInt();
                    count++;
                }
            } else {
                 System.out.println("Please enter a valid number: ");
            }

            scanner.nextLine();

        }

        int maxNum = Math.max(num1, num2);
        System.out.println("Maximum Number: " + maxNum);
        scanner.close();
    }

    public static void minAndMaxChallengeSolution() {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min + " Max = " + max);
        scanner.close();
    }

}
