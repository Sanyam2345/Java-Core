package Methods;

public class ObjectsAsParameter {
    static void update(int A[]) {
        A[0] = 20;
    }
    public static void main(String[] args) {
        int []A = {1,2,3,4,5};
        update(A);
        for (int x:A) {
            System.out.println(x);
        }
    }
}
