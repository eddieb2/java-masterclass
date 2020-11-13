package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double x,double y){
        x = x * 1000d;
        y = y * 1000d;


        if ((int)x == (int)y){
            return true;
        } else return false;
    }
}