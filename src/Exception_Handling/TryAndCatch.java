package Exception_Handling;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a , b , c;
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0. Try again!");
        }
        System.out.println("Bye");
    }
}
