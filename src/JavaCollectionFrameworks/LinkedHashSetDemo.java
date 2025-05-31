package JavaCollectionFrameworks;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(10);
        set.add("A");
        set.add("D");
        set.add("C");
        set.add("B");
        set.add("F");
        set.add("E");

        set.forEach(System.out::println);

    }
}
