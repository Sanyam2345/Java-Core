package StringsAndPrinting;

public class StudentChallenge2 {
    public static void main(String[] args) {
        int b = 100102;
        String s = Integer.toString(b);
        System.out.println("b is binary: " + s.matches("[01]+"));

        int h = 0X12f;
        String hs = Integer.toHexString(h);
//        System.out.println(hs);
        System.out.println("hs is HexaDecimal: " + hs.matches("[0-9 A-F|a-f]+"));
        System.out.println(h);

        String d = "24/12/2023";
        System.out.println(d.matches("[0123][0-9]{2}/[01][0-9]{2}/[0-9]{4}"));
    }
}
