package com.company;

public class Main {

    public static void main(String[] args) {
	// Precision refers to the format and amount of space occupied by the type
        // Single Precision - occupies 32 bits (float)
        // Double Precision - occupies 64 bits (double)

        // Float
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float MIN value = " + myMinFloatValue);
        System.out.println("Float MAX value = " + myMaxFloatValue);

        // Double
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double MIN value = " + myMinDoubleValue);
        System.out.println("Double MAX value = " + myMaxDoubleValue);

        int myIntValue = 5;
//        float myFloatValue = (float) 5.25;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5d;
    }
}
