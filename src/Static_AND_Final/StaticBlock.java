package Static_AND_Final;

class Outer {
    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }
}

public class StaticBlock {
    static {
        System.out.println("Block 3");
    }
    public static void main(String[] args) {
        System.out.println("Main");
        Outer o = new Outer();
    }
}
