package Loops;
import java.util.*;

public class StudentChallenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Multiplication Table
        System.out.print("Enter number to print table: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
        }

        // Sum of n numbers
        System.out.print("Enter number of terms: ");
        int numTerms = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= numTerms; i++) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);

        // Factorial Of a Number
        System.out.print("Enter number to find factorial: ");
        int n = sc.nextInt();
        int fact = 1, temp = n;
        while (temp > 0) {
            fact = fact * temp;
            temp--;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
