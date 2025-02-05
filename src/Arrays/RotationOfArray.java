package Arrays;

public class RotationOfArray {
    public static void main(String[] args) {
        int A[] = {2,3,4,5,6,7,8,9};
        // Rotation of Array to left <--
        System.out.println("Left Shift <--");
        int temp = A[0];
        for (int i= 1; i < A.length; i++) {
            A[i-1] = A[i];
        }
        A[A.length-1] = temp;
        for (int x:A) {
            System.out.print(x + " ");
        }

        // Rotation of Array to right -->
        System.out.println("\nRight Shift -->");
        int temp2 = A[A.length-1];
        for (int i = A.length-2; i >= 0; i--) {
            A[i+1] = A[i];
        }
        A[0] = temp2;
        for (int x:A) {
            System.out.print(x + " ");
        }
    }
}
