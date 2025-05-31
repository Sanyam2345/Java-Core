package JavaCollectionFrameworks;
import java.util.*;

public class ArrayListsAndIterators {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(List.of(20,30,40,50));

        list1.add(3);
        list1.add(5);
        list1.add(6);
        list1.addAll(list2);
        list1.add(2,10);
//        for (Integer integer : list1) {
//            System.out.println(integer);

        for (Iterator<Integer> iterator = list1.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
