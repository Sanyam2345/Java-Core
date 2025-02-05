package Arrays;

public class AdditionOfMatrices {
    public static void main(String[] args) {
        int [][]A = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] B = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] C = new int [A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("The sum of the matrices is:");
        for (int []x: C) {
            for  (int y: x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }
}
