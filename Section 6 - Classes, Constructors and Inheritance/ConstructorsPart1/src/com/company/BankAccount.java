package com.company;

public class BankAccount {
    // Fields
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // Constructor
    public BankAccount() {
        // Sets default parameters
        this("56789", 2.50, "Default name", "Default address", 724777777);
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance  = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    // Setters

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Deposit Funds
    public void depositFunds(double amount) {
        this.balance += amount;
        System.out.println(this.balance);
    }

    public void withdrawFunds(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficient Funds");
        } else {
            this.balance -= amount;
        }
    }
}
