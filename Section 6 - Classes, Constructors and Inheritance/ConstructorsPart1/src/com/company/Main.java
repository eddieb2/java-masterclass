package com.company;

public class Main {

    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount();
//        account1.setAccountNumber("123456");
//        System.out.println(account1.getAccountNumber());
//        account1.depositFunds(100);
//        account1.withdrawFunds(100);
//
//        BankAccount eddiesAccount = new BankAccount("Eddie", "eddie@edd.com", 1234567);
//        System.out.println(eddiesAccount.getAccountNumber());


        System.out.println("Customer 1");
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getEmail());
        System.out.println(person1.getCreditLimit());

        System.out.println("------------------------");

        System.out.println("Customer 2");
        VipCustomer person2 = new VipCustomer("Eddie", 25000);
        System.out.println(person2.getName());
        System.out.println(person2.getEmail());
        System.out.println(person2.getCreditLimit());

        System.out.println("------------------------");

        System.out.println("Customer 3");
        VipCustomer person3 = new VipCustomer("Tim", 100, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
        System.out.println(person3.getCreditLimit());

        System.out.println("------------------------");
    }


}
