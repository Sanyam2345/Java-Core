package JavaDateTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        Period p = Period.of(2,5,3);
        System.out.println(p);
        System.out.println(p.getDays());
        System.out.println(p.getMonths());
        System.out.println(p.getYears());
        System.out.println(p.addTo(LocalDate.now()));
    }
}
