package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public String getNumber() {
        return this.myNumber;
    }

    // add contact
    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        } else {
            contacts.add(contact);
            System.out.println("Contact was successfully added!");
            return true;
        }
    }

    // update contact
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);

        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else {
            this.contacts.set(foundPosition, newContact);
            System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
            return true;
        }
    }

    // remove contact
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);

        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        } else {
            this.contacts.remove(foundPosition);
            System.out.println(contact.getName() + ", was removed.");
            return true;
        }
    }

    // find contact
    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }

        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0){
            return this.contacts.get(position);
        } else {
            return null;
        }
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }

        return null;
    }

    // get contacts
    public void getContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("#" + i+1 + " Name: " + contacts.get(i).getName() + " | Number: " + contacts.get(i).getNumber());
        }
    }
}
