package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer){
            if (temperature < 25 || temperature > 45) {
                return false;
            } else {
                return true;
            }
        } else {
            if (temperature < 25 || temperature > 35) {
                return false;
            } else {
                return true;
            }
        }
    }
}
