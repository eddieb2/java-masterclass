package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
        System.out.println("num as string = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("string to Integer = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println(numberAsString);
        System.out.println(number);

        double dub = Double.parseDouble(numberAsString);
        System.out.println("string to double = " + dub);
    }
}
