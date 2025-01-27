package DataTypeVariableAndLiterals;

public class Literals {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        byte b1 = 10; // decimal
        byte b2 = 0b1010; // Binary
        byte b3 = 012; // Octal
        byte b4 = 0XA; // Hexadecimal

        System.out.println("Decimal byte: " + b1);
        System.out.println("Binary type: " + b2);
        System.out.println("Octal type: " + b3);
        System.out.println("Hexadecimal type: " + b4);

        long l1 = 9999999999l;
        long l2 = 9999999999L;
        System.out.println("long with l: " + l1 + " and with L: " + l2);

        float f1 = 12.56f;
        float f2 = 14.56F;
        System.out.println("float with f: " + f1 + ", F: " + f2);

        double d1 = 7.21;
        double d2 = 8.12d;
        double d3 = 5.45D;
        System.out.println("double as default: " + d1 + ", d: " + d2 + " and D: " + d3);
    }
}
