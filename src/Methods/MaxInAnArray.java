package Methods;

public class MaxInAnArray {
    static int max(int A[]) {
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []A = {2,7,5,3,9};
        int max = max(A);
        System.out.println(max);
    }
}
