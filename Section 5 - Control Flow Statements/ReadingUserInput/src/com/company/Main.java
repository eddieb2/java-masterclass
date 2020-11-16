package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creates a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Grabs the input from the user
        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Handles next line character (enter key)
        scanner.nextLine();

        // Grabs the input from the user
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        int age = 2020 - birthYear;

        System.out.println("Your name is " + name + ", and you are " + age + " years old!");

        scanner.close();
    }
}
