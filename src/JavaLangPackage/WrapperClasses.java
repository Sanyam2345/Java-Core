package JavaLangPackage;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println(i.intValue());
        System.out.println(i.byteValue());
        System.out.println(i.shortValue());
        System.out.println(i.longValue());
        System.out.println(i.floatValue());
        System.out.println(i.doubleValue());
        System.out.println(i.getClass());
        Character c = 'A';
        System.out.println(c.charValue());
        System.out.println(c.getClass());
        Boolean b = true;
        System.out.println(b.booleanValue());
        System.out.println(b.getClass());
    }
}
