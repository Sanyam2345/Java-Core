package Arrays;

public class StudentChallenge1 {
    public static void main(String[] args) {
        int A[] = {1,3,5,7,9,2,4};
        int max1 = A[0],max2 = A[0];
        for (int i = 1; i < A.length; i++) {
            if (max1 < A[i]) {
                max2 = max1;
                max1 = A[i];
            } else if (max2 < A[i]) {
                max2 = A[i];
            }
        }
        System.out.println("Largest element is " + max1);
        System.out.println("Second largest element is " + max2);
    }
}
