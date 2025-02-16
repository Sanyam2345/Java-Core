package OOPS;

import java.util.Scanner;

class Rectangle {
    int length;
    int width;
    Scanner sc = new Scanner(System.in);

    public void setAttributes() {
        System.out.print("Enter length and width respectively: ");
        length = sc.nextInt();
        width = sc.nextInt();
    }
    public int getArea() {
        return (length * width);
    }

    public int getPerimeter() {
        return 2*(length+width);
    }
}

public class ClassFOrRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setAttributes();
        System.out.println("Area is = " + r.getArea());
        System.out.println("Perimeter is = " + r.getPerimeter());
    }
}
