package Operators_And_Expressions;
import java.util.*;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, breadth and height of cuboid: ");
        float length = sc.nextInt();
        float breadth = sc.nextInt();
        float height = sc.nextInt();
        double surface_area = 2 * ((length*breadth) + (breadth*height) + (height*length));
        double Volume = length * breadth * height;
        System.out.println("Surface Area: " + surface_area + " Volume: " + Volume);
    }
}
