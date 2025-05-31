package JavaCollectionFrameworks;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(1, "Sanyam", 2, "Ashwin", 3, "Saksham"));
        System.out.println(hm.size());
        System.out.println(hm);
        System.out.println(hm.get(1));
    }
}
