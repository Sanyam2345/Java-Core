package JavaCollectionFrameworks;
import java.util.*;
import java.util.Map.Entry;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1,"A");
        tm.put(2,"B");
        tm.put(3,"C");
        tm.put(4,"D");
        tm.put(5,"E");

        Entry<Integer, String> e = tm.firstEntry();
        System.out.println(e.getKey() + ", " + e.getValue());
        System.out.println(tm);
        System.out.println(tm.floorEntry(5));
    }
}
