package JavaDateTime;

import java.time.OffsetTime;

public class OffsetTimeDemo {
    public static void main(String[] args) {
        OffsetTime ot = OffsetTime.now();
        System.out.println(ot);
        System.out.println(ot.getHour());
        System.out.println(ot.getMinute());
        System.out.println(ot.getSecond());
        System.out.println(ot.getNano());
        System.out.println(ot.getOffset());
    }
}
