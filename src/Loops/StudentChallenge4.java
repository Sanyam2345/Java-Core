package Loops;

import java.util.Scanner;

public class StudentChallenge4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Display AP, GP series
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.print("Enter first term: ");
        int firstTerm = sc.nextInt();
        System.out.print("Enter difference between terms : ");
        int d = sc.nextInt();
        int num1 = firstTerm, num2 = firstTerm;
        System.out.println("AP Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");
            num1 = num1 + d;
        }
        System.out.println("\nGP Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(num2 + " ");
            num2 = num2 * d;
        }

        // Fibonacci Series
        System.out.println("\nFibonacci Series: ");
        int n1 = 0, n2 = 1, num = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + " ");
            num = n1 + n2;
            n1 = n2;
            n2 = num;
        }
    }
}
