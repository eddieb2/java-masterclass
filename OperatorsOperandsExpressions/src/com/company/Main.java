package com.company;

public class Main {

    public static void main(String[] args) {
        // Operators and Operands
        // + - / * %
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

        // Abbreviating Operators

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("Result++ = " + result);

        result--; // 2 - 1 = 1;
        System.out.println("Result-- = " + result);

        // result = result + 2
        result += 2;
        System.out.println("result += 2 =" + result);

        // result = result * 10
        result *= 10;
        System.out.println("result *= 10 =" + result);

        // result = result / 3;
        result /= 3;
        System.out.println("result /= 3 =" + result);

        // result = result - 2;
        result -= 2;
        System.out.println("result -= 2 =" + result);
    }
}
