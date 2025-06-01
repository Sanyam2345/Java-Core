package JavaDateTime;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.getTime());
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz.getID());
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getOffset(gc.getTimeInMillis()));
    }
}
