package LambdaExpressions;

class UseLambda {
    public void callLambda(MyLambda ml) {
        ml.display();
    }
}

class Demo {
    public void method1 () {
        UseLambda ml = new UseLambda();
        ml.callLambda(()->{
            System.out.println("Hello World");
        });
    }
}

public class CaptureLambdaExpressions {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.method1();
    }
}
