package JavaDateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

public class DurationDemo {
    public static void main(String[] args) throws Exception{
        Duration d = Duration.ofDays(56);
        System.out.println(d);
        System.out.println(d.getSeconds());
        System.out.println(d.toDays());
        System.out.println(d.toHours());
        System.out.println(d.toMinutes());
        System.out.println(d.toMillis());
        System.out.println(d.toNanos());
        System.out.println(d.plusDays(1));
        System.out.println(d.minusDays(1));
        System.out.println();

        Instant i = Instant.now();
        System.out.println(i);
        System.out.println(i.getEpochSecond());
        System.out.println(i.toEpochMilli());
        System.out.println(i.plus(Duration.ofDays(1)));
        System.out.println(i.minus(Duration.ofDays(1)));
    }
}
