package Static_AND_Final;

class Test {
    static int x = 10;
    int y = 20;
    void show (){
        System.out.println(x + " " + y);
    }
    static void display(){
        System.out.println(x);
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show();
        Test.x = 50;
        Test t2 = new Test();
        t2.show();
    }
}
