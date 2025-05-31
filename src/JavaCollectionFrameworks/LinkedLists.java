package JavaCollectionFrameworks;
import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        LinkedList<String> l2 = new LinkedList<>(List.of("Anuj", "Billu", "Chintu"));
        l1.add("Anish");
        l1.addFirst("Santa");
        l1.addLast("Bil");
        l1.add(1,"Canteen");
        l1.addAll(l2);
        System.out.println(l1);
        System.out.println(l1.contains("Santa"));
        l1.removeFirst();
        l1.removeLast();
        l1.remove("Canteen");
        System.out.println(l1.peek());
        System.out.println(l1.peekFirst());
        System.out.println(l1.peekLast());
        System.out.println(l1);
    }
}
