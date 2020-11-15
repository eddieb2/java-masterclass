package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // false
        System.out.println(canPack(1, 0, 5)); // true
        System.out.println(canPack(0, 5, 4)); // true
        System.out.println(canPack(2, 2, 11)); // true
        System.out.println(canPack(-3, 2, 12)); // false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // bigCount = 5 kilos each;
        // smallCount = 1 kilo each
        // goal = goal amount of kilos of flour needed to assemble a package

        if (bigCount < 0 || smallCount < 0) {
            return false;
        }

        int totalCount = (bigCount * 5) + smallCount;

        // if total amount of flour < goal
        if (totalCount < goal) {
            return false;
        }

        for (int i = 0; i < bigCount; i++) {
            if ((goal - 5) >= 0) {
                goal -= 5;
            }
        }

        for (int i = 0; i < smallCount; i++) {
            if ((goal - 1) >= 0) {
                goal -= 1;
            }
        }

        if (goal == 0) {
            return true;
        } else {
            return false;
        }
    }
}
