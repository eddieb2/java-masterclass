package com.company;

public class Main {

    public static void main(String[] args) {
	    Wall wall = new Wall(5,4);
        System.out.println(wall.getArea());

        wall.setHeight(-1.5);
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println(wall.getArea());

        System.out.println();
        Wall wall2 = new Wall(1.125, -1.0);
        System.out.println(wall2.getWidth());
        System.out.println(wall2.getHeight());
        System.out.println(wall2.getArea());

        System.out.println();
        Wall wall3 = new Wall(-1.25, -1.25);
        System.out.println(wall3.getWidth());
        System.out.println(wall3.getHeight());
        System.out.println(wall3.getArea());

    }
}
