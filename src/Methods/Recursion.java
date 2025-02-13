package Methods;

public class Recursion {
    static void fun(int n) {
        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
        }
        throw new RuntimeException("0 is passed");
    }
    public static void main(String[] args) {
        try {
        fun(10);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
