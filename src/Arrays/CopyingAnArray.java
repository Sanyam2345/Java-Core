package Arrays;

public class CopyingAnArray {
    public static void main(String[] args) {
        int []A = {1,2,3,4,5};
        int []B = new int[A.length];
        // Copying an Array
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        for (int x: B) {
            System.out.print(x + " ");
        }

        // Reverse Copying an Array
        System.out.println();
        for (int i = A.length-1,j = 0; i >= 0 && j < A.length ; i--, j++) {
            B[j] = A[i];
        }
        for (int x: B) {
            System.out.print(x + " ");
        }
    }
}
