package Operators_And_Expressions;
import java.util.*;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a,b and c respectively: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double r1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
        double r2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
        System.out.println("Root of quadratic roots is " + r1 + " and " + r2);
    }
}
