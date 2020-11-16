package com.company;

public class Main {

    public static void main(String[] args) {
	    SimpleCalculator calc = new SimpleCalculator();

        calc.setFirstNumber(10);
        calc.setSecondNumber(15);

        System.out.println(calc.getFirstNumber());
        System.out.println(calc.getSecondNumber());
    }
}
