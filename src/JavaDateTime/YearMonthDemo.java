package JavaDateTime;

import java.time.YearMonth;

public class YearMonthDemo {
    public static void main(String[] args) {
        YearMonth ym = YearMonth.now();
        System.out.println(ym);
        System.out.println(ym.getMonth());
        System.out.println(ym.getYear());
    }
}
