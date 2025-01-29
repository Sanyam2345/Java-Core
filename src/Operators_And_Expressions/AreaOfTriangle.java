package Operators_And_Expressions;
import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // For Area of a triangle we need to get base and height of triangle

        /* System.out.print("Enter base and height of the triangle: ");
        float base = input.nextFloat();
        float height = input.nextFloat();
        float area = (base * height)/2;
        System.out.println("Area of a triangle is: " + area); */

        // Another method of finding area is to take length of all sides

        System.out.print("Enter three sides: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is: " + area);

    }
}
