package Methods;

public class WritingMethods {
    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int x = 10, y = 5, c;
//        WritingMethods wm = new WritingMethods();  // If we not declare our method as static
//        c=wm.max(x,y);
        c = max(x, y);
        System.out.println(c);
    }
}
