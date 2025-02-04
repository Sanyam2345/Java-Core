package Loops;
import java.util.*;

public class StudentChallenge3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number  = sc.nextInt();
        String reverse = "";
        int temp = number;
        while (temp > 0) {
            int r = temp % 10;
            reverse = reverse + r;
            temp /= 10;
        }
        for (int i = reverse.length() - 1; i >= 0; i--) {
            char v = reverse.charAt(i);
            switch (v) {
                case '0':
                    System.out.print("zero ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
                default:
                    System.out.print("unknown ");
            }
        }
    }
}
