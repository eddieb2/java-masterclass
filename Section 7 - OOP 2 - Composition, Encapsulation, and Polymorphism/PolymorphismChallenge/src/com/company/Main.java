package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;


    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return this.name;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void startEngine() {
        System.out.println("STARTING ENGINE!");
        this.engine = true;
    }

    public void accelerate() {
        System.out.println("ACCELERATING");
    }

    public void brake() {
        System.out.println("BRAKING");
    }
}

class Porsche extends Car {
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("STARTING " + this.getName() + " ENGINE!");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getName() + " ACCELERATING!");
    }

    @Override
    public void brake() {
        System.out.println(this.getName() + " BRAKING!");
    }
}

class Ferarri extends Car {
    public Ferarri(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("STARTING " + this.getName() + " ENGINE!");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getName() + " ACCELERATING!");
    }

    @Override
    public void brake() {
        System.out.println(this.getName() + " BRAKING!");
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Test", 4);
        car.startEngine();
        car.brake();
        car.accelerate();

        System.out.println();

        Car porsche = new Porsche("911", 6);
        porsche.startEngine();
        porsche.brake();
        porsche.accelerate();

        System.out.println();
        Car ferarri = new Ferarri("ferrari", 8);
        ferarri.startEngine();
        ferarri.brake();1
        ferarri.accelerate();
    }


}
