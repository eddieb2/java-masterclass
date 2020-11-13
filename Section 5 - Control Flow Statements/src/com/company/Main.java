package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 0;

	    while (count != 6) {
            System.out.println("count value is " + count);
            count++;
        }

        System.out.println("----------------------------");

	    for (int i=1; i<=6; i++) {
            System.out.println("count value is " + i);
        }

        System.out.println("----------------------------");

	    count = 1;

	    while (true) {
	        if (count == 6) {
	            break;
            }

            System.out.println("count value is " + count);

            count++;
        }

        System.out.println("----------------------------");

        count = 6;

	    do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);

	    int number = 4;
	    int finishNumber = 20;
	    int evenNumbersFound = 0;

	    while (number <= finishNumber) {
	        number++;

	        if (!isEven(number)) {
	            continue;
            } else {
	            evenNumbersFound++;
                System.out.println("Even number " + number);
            }
	        if (evenNumbersFound == 5) {
                System.out.println(evenNumbersFound);
	            break;
            }
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
