package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2002));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0) {
            return -1;
        }

        // track sum
        int sum = 0;

        // loop until number = 0
        while (number > 0) {
            // extract last digit
            int lastDigit = number % 10;

            // add to sum if even
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }

            // reduce number by last digit
            number /= 10;
        }

        return sum;
    }
}
