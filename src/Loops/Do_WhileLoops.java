package Loops;

public class Do_WhileLoops {
    public static void main(String[] args) {
        int i = 1, n = 100;
        do {
            System.out.println(i);
            i = i * 2;
        }while (i < n);
    }
}
