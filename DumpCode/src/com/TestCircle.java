package com;

public class TestCircle {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(5);
            Circle c2 = new Circle(15);
            Circle c3 = new Circle(-2);
        }
        catch (IllegalArgumentException ex) { 					System.out.println(ex);
        }
        System.out.println("Number of objects created: "
                + Circle.getNumberOfObjects());
    }
}
