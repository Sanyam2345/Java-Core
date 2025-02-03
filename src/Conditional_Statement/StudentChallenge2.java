package Conditional_Statement;
import java.util.*;

public class StudentChallenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Find Radix
//        System.out.print("Enter the String: ");
//        String s = sc.nextLine();
//        if (s.matches("[01]+"))
//            System.out.println("It is Binary and radix is 2");
//        else if (s.matches("[0-7]+")) {
//            System.out.println("It is Octal and radix is 8");
//        } else if (s.matches("[0-9 a-f]+")) {
//            System.out.println("It is Hexadecimal and radix is 16");
//        } else if (s.matches("[0-9]+")) {
//            System.out.println("It is decimal and radix is 10");
//        }

        // Find a given year is leap year
        System.out.print("Enter the year: ");
        int a = sc.nextInt();
        if (a %4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("It is a leap year");
                }
                else
                    System.out.println("It is not a leap year");
            }
            else {
                System.out.println("It is a leap year");
            }
        }
        else {
            System.out.println("It is not a leap year");
        }
    }
}
