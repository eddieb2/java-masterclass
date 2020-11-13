package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigit(1012));
    }

    public static int sumDigit(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            // extract the least-significant digit
            int digit = number % 10;

            sum += digit;

            // drop least significant digit
            number /= 10;
        }

        return sum;
    }
}
