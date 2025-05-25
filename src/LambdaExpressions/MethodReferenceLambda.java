package LambdaExpressions;

public class MethodReferenceLambda {
    public static void reverse (String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        MyLambda1 ml = MethodReferenceLambda::reverse;   // Class.object::method
        ml.display("!dlroW olleH");
    }
}
