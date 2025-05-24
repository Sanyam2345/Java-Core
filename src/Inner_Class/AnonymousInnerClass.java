package Inner_Class;

interface My {
    void display();
}

class Outer2 {
    public void meth () {
        My m = new My() {
            @Override
            public void display() {
                System.out.println("Outer2.meth");
            }
        };
        m.display();
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.meth();
    }
}
