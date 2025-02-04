package Conditional_Statement;
import java.util.Scanner;

public class StudentChallenge5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number and second number respectively: ");
        float b = sc.nextFloat();
        float a = sc.nextFloat();
        System.out.print("+: Addition\n-: Subtraction\nx: Multiplication\n/: Division\nEnter your choice: ");
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println("Addition = " + (a + b));
                break;
            case "-":
                System.out.println("Subtraction: " + (a - b));
                break;
            case "x":
                System.out.println("Multiplication = " + (a * b));
                break;
            case "/":
                System.out.println("Division = " + (a / b));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
