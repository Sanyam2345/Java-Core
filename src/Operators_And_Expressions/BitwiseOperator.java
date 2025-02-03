package Operators_And_Expressions;

public class BitwiseOperator {
    public static void main(String[] args) {
        int x1 = 10, y1 = 6, z1;
        z1 = x1 & y1;
        System.out.println(z1);

        int x2 = 0b1010, y2 = 0b0110, z2;
        z2 = x2 | y2;
        System.out.println(z2);

        int x3 = 0b1000;
        int y3;
        y3 = x3 << 1;
        System.out.println(y3);
    }
}
