package StringsAndPrinting;

public class StudentChallenge3 {
    public static void main(String[] args) {
        // Remove Special Characters
        String s = "a1@gh%$k09";
        System.out.println(s.replaceAll("\\W",""));
        // Remove all Spaces
        String s2 = "Hello World!";
        System.out.println(s2.replaceAll("\\s",""));
    }
}
