package OOPS;

import java.util.Scanner;

class Cylinder {
    int radius;
    int height;
    Scanner sc = new Scanner(System.in);

    public void setAttributes() {
        System.out.print("Enter radius and height of the cylinder: ");
        radius = sc.nextInt();
        height = sc.nextInt();
    }

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    public double area() {
        return (2*Math.PI * radius * (radius + height));
    }
}

public class ClassForCylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setAttributes();
        System.out.println("Area of the cylinder: " + c.area());
        System.out.println("Volume of the cylinder: " + c.volume());
    }
}
