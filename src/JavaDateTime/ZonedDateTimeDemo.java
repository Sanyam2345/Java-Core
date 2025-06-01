package JavaDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        System.out.println(zdt.getDayOfWeek());
        System.out.println(zdt.getDayOfMonth());
        System.out.println(zdt.getMonth());
        System.out.println(zdt.getYear());
        System.out.println(zdt.getHour());
        System.out.println(zdt.getMinute());
        System.out.println(zdt.getSecond());
        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt1);
    }
}
