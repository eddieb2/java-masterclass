package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.45,"White");
        double price = hamburger.itemizeHamburger();
        System.out.println("Total price = " + price);

        hamburger.addHamburgerAddition1("Lettuce", .1);
        hamburger.addHamburgerAddition2("Cheese", .5);
        hamburger.addHamburgerAddition3("Tomatoe", .25);
        price = hamburger.itemizeHamburger();
        System.out.println("Total price = " + price);

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//        healthyBurger.itemizeHamburger();

        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.itemizeHamburger();
    }
}
