package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle circle1 = new Circle(10);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());


        System.out.println();
        System.out.println();

        Cylinder cylinder1 = new Cylinder(10, 10);
        System.out.println(cylinder1.getRadius());
        System.out.println(cylinder1.getArea());
        System.out.println(cylinder1.getVolume());
    }
}
