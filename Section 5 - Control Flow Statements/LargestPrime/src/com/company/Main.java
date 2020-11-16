package com.company;

public class Main {

    public static void main(String[] args) {
        getLargestPrime(21);
    }

    public static int getLargestPrime(int number){
        if (number <= 1) {
            return -1;
        }

        int test = 0;

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                int count = 0;
                while (number % i == 0) {
                    number = number / i;
                    count++;
                }
            }
            test = i;
        }

        if (number > test) {
            return number;
        } else {
            return test;
        }
    }
}
