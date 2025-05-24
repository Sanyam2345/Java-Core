package Packages;
import Packages.mypack1.*;
//import Packages.mypack1.Demo2;

public class Test {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.display();
        Demo2 demo2 = new Demo2();
        demo2.show();
//        System.out.println(demo1.a + demo1.b + demo1.c + demo1.d);
    }
}
