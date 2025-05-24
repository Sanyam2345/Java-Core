package Interface;

interface test1 {
    void meth1();
    void meth2();
}

class My implements test1 {
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }
    public void meth3() {
        System.out.println("meth3");
    }
}

public class Test {
    public static void main(String[] args) {
        test1 t = new My();
        t.meth1();
        t.meth2();
    }
}
