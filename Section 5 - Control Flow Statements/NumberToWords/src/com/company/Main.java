package com.company;

public class Main {

    public static void main(String[] args) {
	    numberToWords(12340000);
//      System.out.println(reverse(1234));
//        System.out.println(reverse(-121));
//        System.out.println(reverse(0));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        String word = "";

        if (number == 0){
            word = "Zero";
        }

        int reversedNum = reverse(number);

        int digitCountBefore = getDigitCount(number);
        int digitCountAfter = getDigitCount(reversedNum);

        while (reversedNum > 0) {
            int lastDigit = reversedNum % 10;

            switch(lastDigit) {
                case 0:
                    word += "Zero";
                    break;
                case 1:
                    word += "One";
                    break;
                case 2:
                    word += "Two";
                    break;
                case 3:
                    word += "Three";
                    break;
                case 4:
                    word += "Four";
                    break;
                case 5:
                    word += "Five";
                    break;
                case 6:
                    word += "Six";
                    break;
                case 7:
                    word += "Seven";
                    break;
                case 8:
                    word += "Eight";
                    break;
                case 9:
                    word += "Nine";
                    break;
            }

            reversedNum /= 10;
            if (reversedNum != 0) {
                word += " ";
            }
        }

        if (digitCountBefore > digitCountAfter) {
            // lost trailing zeros
            int lostDigits = digitCountBefore - digitCountAfter;

            for (int i = 0; i < lostDigits; i++) {
                word += " Zero";
            }
        }

        System.out.println(word);
    }

    public static int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
           number *= -1;
           isNegative = true;
        }

        int reversedNum = 0;
        int numOfDigits = getDigitCount(number);

        while (number > 0) {
            int lastDigit = number % 10;

            for (int i = 1; i < numOfDigits; i++) {
                lastDigit *= 10;
            }

            reversedNum += lastDigit;

            numOfDigits--;
            number /= 10;
        }

        if (isNegative) {
            return  reversedNum * -1;
        } else {
            return reversedNum;
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int numOfDigits = 0;

        while (number > 0) {
            numOfDigits++;
            number /= 10;
        }

        return numOfDigits;
    }
}
