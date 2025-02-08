package Methods;


public class MethodOverloading {
    static float sum(float a, float b) {
        return a + b;
    }

    static  int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args){
        System.out.println("Here we are going to overload the sum method");
        System.out.println("Sum of two float numbers = " + sum(2.4f, 9.8f));
        System.out.println("Sum of two integers = " + sum(5 , 6));
        System.out.println("Sum of three integers = " + sum(5,6,9));
    }
}
