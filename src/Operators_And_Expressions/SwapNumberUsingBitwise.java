package Operators_And_Expressions;

public class SwapNumberUsingBitwise {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println("Values of a and b before swapping: " + a + " and " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Values of a and b after swapping: " + a + " and " + b);
    }
}
