package Arrays;

public class IncreaseSizeOfAnArray {
    public static void main(String[] args) {
        int []A = {1,2,3,4,5};  // Initialising A[]
        int []B = new int [2*A.length]; // Initialising second Array B[]
        System.out.println(A.length); // Printing initial size of Array A[]
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i]; // Copying the elements of Array A[] to B[]
        }
        A = B;  // Pointing A variable to B
        B = null;  // Pointing B to null
        System.out.println(A.length);
    }
}
