package Loops;

public class StudentChallenge6 {
    public static void main(String[] args) {
        // Pattern 1
        System.out.println("Pattern 1\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        // PAttern 2
        System.out.println("Pattern 2\n");
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        // Pattern 3
        System.out.println("Pattern 3\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(j + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\n");

    }
}
