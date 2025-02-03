package StringsAndPrinting;

public class CreatingStrings {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);

        String str2  = new String("Hello Sanyam");
        System.out.println(str2);

        char c[] = {'I',' ','a','m',' ','S','a','n','y','a','m'};
        String str3 = new String(c);
        System.out.println(str3);

        byte b[] = {65,66,67,68};
        String str4 = new String(b);
        System.out.println(str4);
    }
}
