package JavaCollectionFrameworks;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");

        /* Enumeration e = ht.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        } */
        ht.compute(3, (x, y) -> "C"+y);
        ht.computeIfAbsent(5, (k) -> "E");
        System.out.println(ht);
    }
}
