package NewPackage;

import java.io.IOException;

public class CircleMainClass {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(5);
            Circle c2 = new Circle(51);
            Circle c3 = new Circle(-5);
            Circle c4 = new Circle(5);
            Circle c5 = new Circle(10);
        }
        catch (InvalidRadiusException ex) {
            System.out.println("Invalid Radius: " + ex.getRadius());
        } catch(NullPointerException nullPointerException){
            System.out.println("OPPs!!! You Can't Enter Anything");
        }

        System.out.println("Number of objects created: " +
                Circle.getNumberOfObjects());
    }
}
