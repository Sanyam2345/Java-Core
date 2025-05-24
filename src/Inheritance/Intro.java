package Inheritance;

class Circle {
    private double radius;
    public Circle() {
        radius = 1;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Cylinder extends Circle {
    private double height;
    public Cylinder () {
        height = Math.random();
    }
    public double volume() {
        return area() * height;
    }
}

public class Intro {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        System.out.println(circle.area());
        System.out.println(cylinder.perimeter());
        System.out.println(cylinder.volume());
    }
}
