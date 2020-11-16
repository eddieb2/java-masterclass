package com.company;

public class Main {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        int totalRows = number;
        int totalColumns = number;

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0; row < totalRows; row++) {

                for (int column = 0; column < totalColumns; column++) {
                    if (
                            row == 0 ||
                            row == (totalRows - 1) ||
                            column == 0 ||
                            column == (totalColumns - 1) ||
                            row == column ||
                            column == (totalRows - row - 1))
                    {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println("");
            }
        }
    }
}
