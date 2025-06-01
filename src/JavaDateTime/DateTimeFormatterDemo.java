package JavaDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.format(dtf));
        System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ldt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(ldt.get(ChronoField.YEAR));
        System.out.println(ldt.get(ChronoField.HOUR_OF_DAY));
        System.out.println(ldt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(ldt.get(ChronoField.SECOND_OF_MINUTE));
    }
}
