package JavaDateTime;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getYear());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());
    }
}
