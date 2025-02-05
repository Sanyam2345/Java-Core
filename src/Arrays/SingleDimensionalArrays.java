package Arrays;

public class SingleDimensionalArrays {
    public static void main(String[] args) {
        int A[] = new int[5];
        int B[] = {1,2,3,4,5};
        for (int i = 0; i < B.length; i++) {
            A[i] = B[i]*2;
        }
        for (int i = 0; i < A.length; i++) {  // Counter Controlled for-loop
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int x: B) { // for each loop
            System.out.print(x + " ");
        }
    }
}
