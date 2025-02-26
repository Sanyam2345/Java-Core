package OOPS;

class Rectangle2 {
    private int length;
    private int width;
    public Rectangle2() {
        length = 1;
        width = 1;
    }
    public Rectangle2(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle2(int s) {
        length = width = s;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Rectangle2 rectangle = new Rectangle2(2);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
