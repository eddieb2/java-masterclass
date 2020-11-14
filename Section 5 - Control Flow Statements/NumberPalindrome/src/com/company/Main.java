package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-2002));
    }

    public static boolean isPalindrome(int number) {
        // if number is negative, convert to positive
        if (number < 0){
            number *= -1;
        }

        int originalNumber = number;
        int reverse = 0;

        while (number > 0) {
            // extract the last digit
            int lastDigit = number % 10;

            // increase place value of reverse by 1
            reverse *= 10;

            // add last digit to reverse
            reverse += lastDigit;

            // remove last digit
            number /= 10;
        }


        if (originalNumber == reverse) {
            return true;
        } else {
            return false;
        }

    }

}
