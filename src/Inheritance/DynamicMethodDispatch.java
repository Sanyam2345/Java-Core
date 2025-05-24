package Inheritance;

class SuperClass {
    public void meth1 () {
        System.out.println("Meth 1");
    }
    public void meth2 () {
        System.out.println("Meth 2");
    }
}

class SubClass extends SuperClass {
    public void meth2 () {
        System.out.println("Sub Meth 2");
    }
    public void meth3 () {
        System.out.println("Meth 3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        SubClass subClass = new SubClass();
        superClass.meth1();
        superClass.meth2();
        SuperClass superClass2 = new SubClass();
        superClass2.meth2();
    }
}
