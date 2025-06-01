package JavaDateTime;

import java.time.MonthDay;

public class MonthDayDemo {
    public static void main(String[] args) {
        MonthDay md = MonthDay.now();
        System.out.println(md);
        System.out.println(md.getMonth());
        System.out.println(md.getDayOfMonth());
        System.out.println(md.getMonthValue());

    }
}
