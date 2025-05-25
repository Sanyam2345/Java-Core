package LambdaExpressions;
@FunctionalInterface
interface MyLambda1 {
    public void display(String s);
//    public int add(int a, int b);
}

public class ParametersLambda {
    public static void main(String[] args) {
        MyLambda1 lb = (s)-> {
            System.out.println(s);
        };
        lb.display("Hello");
//        MyLambda1 lb = (a,b) -> a+b;
//        System.out.println(lb.add(5,6));
    }
}
