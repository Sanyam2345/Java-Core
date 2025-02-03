package StringsAndPrinting;

public class StringMethods3 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JAVA";
        String s3 = "Jetbrains";
        String s4 = "Jetbrains";
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
//        System.out.println(s1.valueOf(97));
        System.out.println(s1.contains("pr"));
        System.out.println(s1.concat(" is a programming language"));
    }
}
