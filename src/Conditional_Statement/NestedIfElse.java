package Conditional_Statement;

public class NestedIfElse {
    public static void main(String[] args) {
        int a = 8, b = 7, c = 9;
        if ((a > b) && (a > c)) {
            System.out.println(a + " is greater than both " + b + " and " + c);
        }
        else {
            if (b > c) {
                System.out.println(b + " is greater than both " + a + " and " + c);
            }
            else {
                System.out.println(c + " is greater than both " + a + " and " + b);
            }
        }
    }
}
