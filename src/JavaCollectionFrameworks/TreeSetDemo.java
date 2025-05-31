package JavaCollectionFrameworks;

import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(25,85,14,56,32));
        System.out.println(ts);
        System.out.println(ts.ceiling(15));
        System.out.println(ts.floor(15));
    }
}
