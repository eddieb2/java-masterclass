package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Final Sum: " + sumFirstAndLastDigit(10002));
        System.out.println("Final Sum: " + secondSolutionSumFirstAndLastDigit(101));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int count = 1;

        if (number < 10) {
            sum = (number + number);
            return sum;
        }

        while (number > 0){

            // reduce number by one digit, for the first go
            if (count == 1) {
                // extract least sig digit > add to sum first time
                int lastDigit = number % 10;
                sum += lastDigit;
            }

            // Copy the original num, to check after reduction, if num == 0.
            int numberCopy = number;

            number /= 10;

            // if num == 0, this is the last digit, add to sum.
            if (number == 0){
                sum += numberCopy;
            }

            count++;
        }

        // return sum of first and last digit
        return sum;
    }

    public static int secondSolutionSumFirstAndLastDigit(int number) {
        if (number < 0){
            return -1;
        }


        int lastDigit = number % 10;
        int firstNumber = number;

        while (number >= 10) {
            firstNumber = number /= 10;
        }

        return firstNumber + lastDigit;
    }
}
