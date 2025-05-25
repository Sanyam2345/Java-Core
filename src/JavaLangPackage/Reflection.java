package JavaLangPackage;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {}

    public My(int x,int y) {}

    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}

}

public class Reflection {
    public static void main(String[] args) {
        Class c = My.class;
        System.out.println(c.getName());
        System.out.println(c.getSuperclass().getName());
        System.out.println(c.getModifiers());
        System.out.println(c.getPackage().getName());
        System.out.println(c.getDeclaringClass());
        System.out.println(c.getEnclosingClass());
        System.out.println(c.getEnclosingMethod());
        System.out.println(c.getEnclosingConstructor());
//        System.out.println(c.getInterfaces());
//        System.out.println(c.getDeclaredConstructors());
    }
}
