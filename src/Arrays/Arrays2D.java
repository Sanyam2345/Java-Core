package Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int A[][] = new int [3][4];  // C-Style
        int[][] B = {{1,2,3,4},{2,4,6,8},{1,3,5,7}}; // Java Style
        int []C[] = new int [3][]; // Jagged Array
        C[0] = new int[] {1,2,3};
        C[1] = new int[] {2,4,6,8};
        C[2] = new int[] {1,3,5,7,9};
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int[] x : C) {
            for (int y:x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
