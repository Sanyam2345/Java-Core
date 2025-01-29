package Operators_And_Expressions;

public class OperatorExample {
    public static void main(String[] args) {
        int a1 = 14, b1 = 5;
        int c1 = a1/b1;
        int r1 = a1%b1;
        System.out.println(c1); // 2
        System.out.println(r1); // 4

        float a2 = 14.3f, b2 = 3.2f;
        float c2 = a2/b2;
        float r2 = a2%b2;
        System.out.println(c2);  // 4.46875
        System.out.println(r2); // 1.5

        byte a3 = 10;
        short b3 = 15;
        int c3 = a3 + b3;
        System.out.println(c3); // 25 (int)

        float a4 = 14.3f;
        long b4 = 1231;
        float c4 = a4 + b4;
        System.out.println(c4); // 1245.3

        float a5 = 12.5f;
        double b5 = 13.6666;
        double c5 = a5 + b5;
        System.out.println(c5); // 26.166600000000003 (double)

        char a6 = 12;
        int b6 = 8;
        int c6 = a6 + b6;
        System.out.println(c6); // 20 (int)

        System.out.println(10+20/5); // 14
        System.out.println(10/2*5); // 25
        System.out.println(10*2/5); // 4
    }
}
