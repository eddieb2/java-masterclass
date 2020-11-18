package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber("123456");
        System.out.println(account1.getAccountNumber());
        account1.depositFunds(100);
        account1.withdrawFunds(100);
    }


}
