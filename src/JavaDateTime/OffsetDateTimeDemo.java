package JavaDateTime;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeDemo {
    public static void main(String[] args) {
     OffsetDateTime odt = OffsetDateTime.now();
     System.out.println(odt);
     System.out.println(odt.getDayOfWeek());
     System.out.println(odt.getDayOfMonth());
     System.out.println(odt.getMonth());
     System.out.println(odt.getYear());
     System.out.println(odt.getHour());
     System.out.println(odt.getMinute());
     System.out.println(odt.getSecond());
     OffsetDateTime odt1 = OffsetDateTime.now(ZoneOffset.of("-05:30"));
     System.out.println(odt1);
     System.out.println(odt1.getDayOfWeek());
     System.out.println(odt1.getDayOfMonth());
     System.out.println(odt1.getMonth());
     System.out.println(odt1.getYear());
     System.out.println(odt1.getHour());
     System.out.println(odt1.getMinute());
     System.out.println(odt1.getSecond());
    }
}
