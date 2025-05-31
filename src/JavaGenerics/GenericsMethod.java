package JavaGenerics;

public class GenericsMethod {
    static<T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"Arnav", "Basu", "Cinty", "Dolphin", "Envy", "Faluda"};
        printArray(arr);
    }
}
