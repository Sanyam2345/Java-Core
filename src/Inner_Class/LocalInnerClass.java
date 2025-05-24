package Inner_Class;

class Outer1 {
    void display () {
        class Inner {
            void innerDisplay() {
                System.out.println("Inner Display");
            }
        }
        Inner i = new Inner();
        i.innerDisplay();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.display();
    }
}
