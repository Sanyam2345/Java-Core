package JavaCollectionFrameworks;

import java.util.*;

class My implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2)
            return -1;
        else if (o1<o2)
            return 1;
        else
            return 0;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Integer []a = {3,2,4,1,6};
        Arrays.sort(a,new My());
//        System.out.println(Arrays.binarySearch(a,4));
        for (int i:a) {
            System.out.println(i);
        }
    }
}
