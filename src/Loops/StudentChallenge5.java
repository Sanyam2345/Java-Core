package Loops;

public class StudentChallenge5 {
    public static void main(String[] args) {
        // Pattern 1
        System.out.println("Pattern 1\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        // Pattern 2
        System.out.println("Pattern 2\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        // Pattern 3
        System.out.println("Pattern 3\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j+i + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        // PAttern 4
        System.out.println("Pattern 4\n");
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(++count + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
