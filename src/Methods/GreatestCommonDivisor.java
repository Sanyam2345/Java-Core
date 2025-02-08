package Methods;

import java.util.Scanner;

public class GreatestCommonDivisor {
    static int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a,b) ; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int gcd = gcd(a,b);
        System.out.println("The greatest common divisor is: " + gcd);
    }
}
