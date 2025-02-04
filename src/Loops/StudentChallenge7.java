/*
   5 4 3 2 1
1  * * * * *
2    * * * *
3      * * *
4        * *
5          *
*/

package Loops;

public class StudentChallenge7 {
    public static void main(String[] args) {
        // Pattern 1
        for (int i = 5; i >= 1; i--) {
            for (int b = 1; b <= 5-i ; b++) {
                System.out.print(" " + "\t\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        // Pattern 2
        /*
          1 2 3 4 5
        5         *
        4       * *
        3     * * *
        2   * * * *
        1 * * * * *
        */
        for (int i = 5; i >= 1; i--) {
            for (int b = 1; b <= i-1; b++) {
                System.out.print(" " + "\t\t");
            }
            for (int j = 1; j <= 6-i; j++) {
                System.out.print("*" + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        // Pattern 3
        /*
          1 2 3 4 5 6 7 8 9
        9         *
        8       * * *
        7     * * * * *
        6   * * * * * * *
        5 * * * * * * * * *
        */

        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        System.out.println();
//        * * * * * * *
//          * * * * *
//            * * *
//              *
        for (int i = 1; i <= n-1; i++) {
            // Print leading spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= 9-(2*i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
