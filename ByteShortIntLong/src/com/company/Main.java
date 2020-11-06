package com.company;

/* PRIMATIFVE TYPES
* boolean
* byte
* char
* short
* int
* long
* float */

public class Main {

    public static void main(String[] args) {
        ///////// INTEGERS //////////
        // 32 bits ( 4 bytes)

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // overflow
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        // underflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        // int myMaxIntTest = 2147483648;
        // int myMaxIntTest = 2_147_483_648; <-- Valid format

        ///////// BYTE //////////
        //  8 bits

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte MIN Value = " + myMinByteValue);
        System.out.println("Byte MAX Value = " + myMaxByteValue);

        ///////// SHORT //////////
        // 16 bits (2bytes)

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short MIN Value = " + myMinShortValue);
        System.out.println("Short MAX Value = " + myMaxShortValue);

        short bigShortLiteralValue = 32767;
        
        ///////// LONG //////////
        // 64 bits (8 bytes)
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long MIN Value = " + myMinLongValue);
        System.out.println("Long MAX Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_648L;
        System.out.println(bigLongLiteralValue);
    }
}
