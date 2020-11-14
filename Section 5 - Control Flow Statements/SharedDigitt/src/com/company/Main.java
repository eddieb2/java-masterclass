package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(20,21));
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
}
