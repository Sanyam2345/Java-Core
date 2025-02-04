package Loops;

import java.util.Scanner;

public class StudentChallenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Display Digit of a given number
        System.out.print("Enter number to display: ");
        int num = sc.nextInt();
        System.out.println("Digits of " + num + " are: ");
        while (num > 0) {
            int r = num%10;
            System.out.print(r + " ");
            num = num/10;
        }
        System.out.println();

        // Count Digits of a number
        System.out.print("Enter number to count digits: ");
        int n = sc.nextInt();
        int counter = 0;
        while (n > 0) {
            counter++;
            n = n/10;
        }
        System.out.println("Number of digits: " + counter);

        // Number is Armstrong or not
        int counter2 = 0;
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int temp = number;
        while (temp > 0) {
            counter2++;
            temp = temp/10;
        }
        int temp2 = number;
        int sum = 0;
        while (temp2 > 0 ) {
            double r = temp2%10;
            sum = (int) (sum + Math.pow(r,(double)counter2));
            temp2 = temp2/10;
        }
        if (sum == number) {
            System.out.println("Yes, " + number + " is an Armstrong number");
        }
        else {
            System.out.println(number + " is not an Armstrong number");
        }

        // Reversing a number and checking it is pallindrome or not
        System.out.print("Enter number: ");
        int num2 = sc.nextInt();
        int reverse = 0;
        int temp3 = num2;
        while (temp3 > 0) {
            int r = temp3%10;
            reverse = reverse*10 + r;
            temp3 = temp3/10;
        }
        if (reverse == num2) {
            System.out.println("Yes, " + num2 + " is a Pallindrome Number");
        }
        else {
            System.out.println(num2 + " is not a Pallindrome Number");
        }
    }
}
