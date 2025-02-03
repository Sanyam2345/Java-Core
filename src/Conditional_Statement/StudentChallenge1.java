package Conditional_Statement;
import java.util.*;

public class StudentChallenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ques 1: No is even or odd
        System.out.print("Enter any Number: ");
        int a = sc.nextInt();
        if (a % 2 == 0)
            System.out.println(a + " is even");
        else
            System.out.println(a + " is odd");

        // Ques 2: Person is young or not
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age > 14 && age < 55)
            System.out.println("Person is young");
        else if (age < 14) {
            System.out.println("Person is child");
        }
        else {
            System.out.println("Person is older");
        }

        // Ques 3: Find grades for given marks
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks > 75) {
            System.out.println("Grade: A");
        }
        else if (marks > 50) {
            System.out.println("Grade: B");
        }
        else if (marks > 33) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("You are failed!");
        }
    }
}
