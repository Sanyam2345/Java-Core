package AbstractClasses;

abstract class AbstractClass {
    AbstractClass() {
        System.out.println("AbstractClass Constructor");
    }
    void meth1 () {
        System.out.println("meth 1");
    }
    abstract void meth2();
}

class Sub2 extends AbstractClass {
    void meth2 () {
        System.out.println("Meth 2");
    }
}

public class AbstractIntro {
    public static void main(String[] args) {
        AbstractClass obj;
        Sub2 sub = new Sub2();
        sub.meth2();
    }
}
