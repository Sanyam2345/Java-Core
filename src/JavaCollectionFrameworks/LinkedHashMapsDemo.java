package JavaCollectionFrameworks;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapsDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 5;
            }
        };
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.get(4);
        lhm.get(1);
        lhm.put(6, "F");
        lhm.forEach((k,v)->System.out.println(k + "," + v));



    }
}
