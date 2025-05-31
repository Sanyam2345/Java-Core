package JavaCollectionFrameworks;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(2);
        pq.add(13);
        pq.add(4);
        pq.add(50);
        pq.forEach((x) -> System.out.println(x));
        System.out.println("After Deletion");
        pq.poll();
        pq.forEach((x) -> System.out.println(x));

    }
}
