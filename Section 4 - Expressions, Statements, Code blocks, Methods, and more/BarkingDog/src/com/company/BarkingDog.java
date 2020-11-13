package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        // wake up if before 8 || after 22 return true
        // else return false

        // hourOfDay less than 0 || greater than 23 return false

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            if (barking) {
                if (hourOfDay < 8 || hourOfDay > 22){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
