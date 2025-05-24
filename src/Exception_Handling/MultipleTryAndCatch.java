package Exception_Handling;

public class MultipleTryAndCatch {
    public static void main(String[] args) {
        int []A = {2,6,4,8,0};
        try {
            try {
                int c = A[0] / A[4];
                System.out.println("Division is: " + c);
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Division is: " + e.getMessage());
            }
            System.out.println(A[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Bye");
    }
}
