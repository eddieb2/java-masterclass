package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creates a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Grabs the input from the user
        System.out.println("Enter your birth year: ");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int birthYear = scanner.nextInt();

            // Handles next line character (enter key)
            scanner.nextLine();

            // Grabs the input from the user
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            // Calculates age
            int age = 2020 - birthYear;

            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old!");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }



        scanner.close();
    }
}
