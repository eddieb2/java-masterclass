package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank1");
        bank.addBranch("Branch1");
        bank.addCustomer("Branch1", "eddie", 100.00);

        bank.addBranch("Branch2");
        bank.addCustomer("Branch2", "Joe", 200.00);

        bank.addCustomerTransaction("Branch1", "eddie", 50.00);

        bank.listCustomers("Branch1", true);
    }
}
