package com.company;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 3;

	    switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'A';

	    switch(charValue) {
            case 'A':
                System.out.println("A was found!");
                break;
            case 'B':
                System.out.println("B was found!");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found!");
                break;
            default:
                System.out.println("Couldn't find a,b,c,d or e");
                break;
        }


        String month = "Jan";

	    switch(month.toLowerCase()) {
            case "jan":
                System.out.println("January");
                break;
            case "jun":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure!");
                break;
        }
    }
}
