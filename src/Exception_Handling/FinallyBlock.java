package Exception_Handling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int c = 10/0;
        }
        finally {
            System.out.println("Finally block is called");
        }
    }
}
