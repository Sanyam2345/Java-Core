package StringsAndPrinting;

public class StringMethods2 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World"));
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf("World"));
        System.out.println(str.lastIndexOf("World", 5));
    }
}
