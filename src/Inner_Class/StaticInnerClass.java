package Inner_Class;

class Outer3 {
    static int x = 10;
    int y = 20;
    static class Inner {
        void display() {
            System.out.println(x);
//            System.out.println(y); {Error}
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer3.Inner o = new Outer3.Inner();
        o.display();
    }
}
