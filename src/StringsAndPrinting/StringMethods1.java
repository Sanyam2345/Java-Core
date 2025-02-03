package StringsAndPrinting;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "    Java      is ";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str1.trim());
        System.out.println(str.substring(6));
        System.out.println(str.substring(6,10));
        System.out.println(str.replace('l','g'));
    }
}
