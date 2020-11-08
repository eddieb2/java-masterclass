package com.company;

public class Main {

    public static void main(String[] args) {
        // ---- Operators and Operands ---- //
        // + - / * %
        System.out.println("---Operators and Operands ---");

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


        // ---- Abbreviating Operators ---- //
        System.out.println("\n");
        System.out.println("---Abbreviating Operators ---");

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



        // ---- If Then Statement ---- //
        System.out.println("\n");
        System.out.println("---IF THEN STATEMENTS ---");

        boolean isAlien = false;


        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        // ---- Logical AND Operator ---- //

        int topScore = 80;

        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;

        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }

        // ---- Logical OR Operator ----  //

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true!");
        }

        // ---- Assignment Operator VS Equals to Operator ---- //

        int newValue = 50;

        /*
        if (newValue = 50) {
            System.out.println("This is an error.");
        }
        */

        boolean isCar = false;

        if (isCar = true) {
            System.out.println("This is not supposed to happen.");
        }

        if (isCar) {
            System.out.println("Tested for true!");
        }

        if (!isCar) {
            System.out.println("Tested for false!");
        }

        // ---- Ternary Operator ---- //

        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true.");
        }

    }
}
