package Methods;

import java.util.Scanner;

public class ValidateNameAndAge {
    static  boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    static  boolean validate(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of your person: ");
        String name = sc.nextLine();
        System.out.print("Enter the age of your person: ");
        int age = sc.nextInt();
        if (validate(name) && validate(age)) {
            System.out.println("Your name is valid");
        }
        else {
            System.out.println("Your name is not valid");
        }
    }
}
