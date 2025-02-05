package Arrays;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        int [][]A = {{1,2,3},{4,5,6},{7,8,9}};
        int [][]B = {{1,2,3},{4,5,6},{7,8,9}};
        int [][]C = new int [A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[i].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("The multiplication of Matrices is ");
        for (int []x: C) {
            for (int y: x) {
                System.out.print(y + "\t");
            }
        System.out.println();
        }
    }
}
