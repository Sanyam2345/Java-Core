package Introduction;
import java.util.*;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        int z = x + y;
        System.out.println("Sum is: " + z);
    }
}
