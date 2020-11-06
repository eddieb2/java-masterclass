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

        int myIntValue = 5 / 3;
//        float myFloatValue = (float) 5.25;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("MyIntValues = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);
    }
}
