package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        --- Primitive Types ---
         byte
         short
         int
         long
         float
         double
         char
         boolean
         */

        /*
        ---- STRINGS ----
        Strings are immutable
         */

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Number String = " + numberString); // 250.5549.95

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String = " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String = " + lastString);
    }
}
