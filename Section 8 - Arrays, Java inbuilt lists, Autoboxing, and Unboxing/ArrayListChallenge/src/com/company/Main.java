package com.company;

import java.util.Scanner;

public class Main {
    /*
        Create a program that implements a simple mobile phone with the folowing capabilities

        able to add, modify, remove and query contact names - mobile phone
        separate class for Contacts
        create a master class named MobilePhone that holds the ArrayList of Contacts
        add a menu of options that are available
        options: quit, print list of contacts, add contact, update contact, remove contact, search contact

    */

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("111-111-1111");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();

        while(!quit) {
            System.out.println("\n Enter: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void printContacts() {
        mobilePhone.getContacts();
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();

        Contact newContact = Contact.createContact(name, number);
        if (mobilePhone.addContact(newContact)) {
            System.out.println("New contact added: name = " + name + " phone = " + number);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - To shutdown\n" +
                "1 - To print contacts\n" +
                "2 - To add a new contact\n" +
                "3 - To update existing contact\n" +
                "4 - To remove an existing contact\n" +
                "5 - Query for contact\n" +
                "6 - To print a list of available actions");
        System.out.println("Choose your action: ");
    }
}
