package LambdaExpressions;

@FunctionalInterface
interface MyLambda {
    public void display();
}

public class Introduction {
    public static void main(String[] args) {
        MyLambda myLambda = () -> {
            System.out.println("Hello World");
        };
        myLambda.display();
    }
}
