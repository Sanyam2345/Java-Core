package OOPS;
import java.util.Scanner;

class Circle {
    Scanner sc = new Scanner(System.in);
    double radius;

    public void setRadius() {
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    public double area () {
        return Math.PI * radius * radius;
    }
    public double perimeter () {
        return 2 * Math.PI * radius;
    }

}

public class CLassForCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius();
        System.out.println("Area of Circle is = " + c.area());
        System.out.println("Perimeter of Circle is = " + c.perimeter());
    }
}
