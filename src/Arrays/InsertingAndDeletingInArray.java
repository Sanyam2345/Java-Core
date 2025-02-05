package Arrays;

import java.util.Scanner;

public class InsertingAndDeletingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        // Inserting an element in the array at any given index
        int key = 12;
        int index = 2;
        int n = 6;
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = n; i > index; i--) {
            A[i] = A[i - 1];
        }
        A[index] = key;
        for(int x: A) {
            System.out.print(x + " ");
        }

        // Deleting an element in the array from the given index
        System.out.println();
        for (int i = index; i <= n; i++) {
            A[i] = A[i + 1];
        }
        A[n] = 0;
        for(int x: A) {
            System.out.print(x + " ");
        }
    }
}
