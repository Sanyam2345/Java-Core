package AbstractClasses;

abstract class Shapes {
    abstract double perimeter();
    abstract double area();
}

class Rectangle extends Shapes {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    Rectangle() {
        length= 1;
        width = 1;
    }

    @Override
    double perimeter() {
        return 2*(length+width);
    }

    @Override
    double area() {
        return length*width;
    }
}

class Circle extends Shapes {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    Circle() {
        radius = 1;
    }
    @Override
    double perimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    double area() {
        return Math.PI*(radius*radius);
    }
}

public class ShapeClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        Circle circle = new Circle(4);
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Perimeter of Circle: " + circle.perimeter());
        System.out.println("Area of Circle: " + circle.area());
    }
}
