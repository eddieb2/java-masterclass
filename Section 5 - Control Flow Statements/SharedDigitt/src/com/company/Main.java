package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(20,21));
        System.out.println(SecondSolutionHasSharedDigit(523,283));
    }

    public static boolean hasSharedDigit(int x, int y){
        if (x < 10 || x > 99 || y < 10 || y > 99){
            return false;
        }

        int yCopy = y;

        while (x > 0) {
            // extract last digit
            int xLastDigit = x % 10;

            y = yCopy;

            while (y > 0) {
                int yLastDigit = y % 10;

                if (xLastDigit == yLastDigit) {
                    return true;
                }

                y /= 10;
            }

            x /= 10;
        }

        return false;
    }

    public static boolean SecondSolutionHasSharedDigit(int num1, int num2) {
        // THIS ONLY WORKS ON NUMBERS BETWEEN 10 - 99
        if((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {

            while(num1 > 0 || num2 > 0) {

                int firstNum = num1 % 10;
                int secondNum = num2 % 10;

                num1 /= 10;
                num2 /= 10;

                if((firstNum == num2 || secondNum == num1) || firstNum == secondNum) {
                    return true;
                }
            }
        }
        return false;
    }
}
