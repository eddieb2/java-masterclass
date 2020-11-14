package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11,22,31));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (x < 10 || y < 10 || z < 10 || x > 1000 || y > 1000 || z > 1000) {
            return false;
        }

        int xLastDigit = x % 10;
        int yLastDigit = y % 10;
        int zLastDigit = z % 10;


        if (xLastDigit == yLastDigit) {
            return true;
        }

        if (xLastDigit == zLastDigit) {
            return true;
        }

        if (yLastDigit == zLastDigit) {
            return true;
        }

        return false;

    }

    public static boolean isValid(int number){
        if (number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }
    }
}
