package Inheritance;

class Super {
    public void display() {
        System.out.println("Super display");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("Sub display");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Super super1 = new Super();
        super1.display();
        Sub sub1 = new Sub();
        sub1.display();
    }
}
