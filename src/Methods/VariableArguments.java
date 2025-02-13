package Methods;

public class VariableArguments {
    static void show(int ...a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        show();
        show(10);
        show(10,20,30);
        show(new int[] {10,20,30,40,50,60});
    }
}
