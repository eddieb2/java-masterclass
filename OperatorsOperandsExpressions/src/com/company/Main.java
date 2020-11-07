package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(result);

        int previousResults = result;
        System.out.println("Previous result = " + previousResults);

        result = result - 1;
        System.out.println("Result = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);
    }
}
