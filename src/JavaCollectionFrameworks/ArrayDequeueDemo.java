package JavaCollectionFrameworks;
import java.util.*;

public class ArrayDequeueDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        // Add last remove first (Work like a queue)
        dq.addLast(10);
        dq.addLast(20);
        dq.pollFirst();
        System.out.println(dq);
        // Add last remove last (Work like a stack)
        dq.addLast(30);
        dq.addLast(40);
        dq.pollLast();
        System.out.println(dq);

    }
}
