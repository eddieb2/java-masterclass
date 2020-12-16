package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone phone;
        phone = new DeskPhone(12345);
        phone.powerOn();
        phone.callPhone(123444);
        phone.answer();
    }
}
