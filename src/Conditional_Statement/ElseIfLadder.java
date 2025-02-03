package Conditional_Statement;

public class ElseIfLadder {
    public static void main(String[] args) {
        int a = 2, b = 5, c = 7;
        if (a > b && a > c) {
            System.out.println(a + " is greater than " + b + " and " + c);
        }
        else if (b > a && b > c) {
            System.out.println(b + " is greater than " + a + " and " + c);
        }
        else {
            System.out.println(c + " is greater than " + a + " and " + b);
        }
    }
}
