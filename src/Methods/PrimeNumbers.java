package Methods;

import java.util.Scanner;

public class PrimeNumbers {
    static void Prime(int n) {
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println("Prime Number");
        else if(count == 1)
            System.out.println("Neither a prime nor a composite");
        else
            System.out.println("Not a prime number: Composite Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Prime(num);
    }
}
