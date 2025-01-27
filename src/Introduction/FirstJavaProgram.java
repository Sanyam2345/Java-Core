package Introduction;
import java.util.*;

public class FirstJavaProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = s.nextLine();
        System.out.println("Welcome " + name);
    }
}
