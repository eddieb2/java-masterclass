package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Eddie");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        /////////////// Autoboxing && UNBOXING ////////////////////////

        // ==>> LONG WAY
//        Integer integer = new Integer(54);
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i++){
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }

        // ==>> SHORT WAY
        Integer myIntValue = 56; // Integer.valueOf(56) <--- at compile time
        int myInt = myIntValue; // myInt.intValue();


        ////////////

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += .5) {
            // LONG
//            myDoubleValues.add(Double.valueOf(dbl));
            // SHORT
            myDoubleValues.add(dbl);
        }

        for (int i= 0; i<myDoubleValues.size(); i++){
            // LONG
//            double value = myDoubleValues.get(i).doubleValue();
            // SHORT
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }

}
