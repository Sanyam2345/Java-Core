package JavaDateTime;

import java.time.LocalDate;

public class JodaTimeAPIDemo {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate ld1 = LocalDate.of(2021, 12, 12);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.parse("2021-12-11");
        System.out.println(ld2);
        LocalDate ld3 = LocalDate.ofYearDay(2021, 121);
        System.out.println(ld3);
        LocalDate ld4 = LocalDate.ofEpochDay((365*2));
        System.out.println(ld4);
        LocalDate ld5 = LocalDate.of(2021, 12, 31).plusDays(1);
        System.out.println(ld5);
        LocalDate ld6 = LocalDate.of(2021, 1, 1).minusDays(1);
        System.out.println(ld6);
        LocalDate ld7 = LocalDate.of(2021, 12, 1).plusMonths(1);
        System.out.println(ld7);
        LocalDate ld8 = LocalDate.of(2021, 1, 1).minusMonths(1);
        System.out.println(ld8);
        LocalDate ld9 = LocalDate.of(2021, 1, 1).plusYears(1);
        System.out.println(ld9);
        LocalDate ld10 = LocalDate.of(2021, 1, 1).minusYears(1);
        System.out.println(ld10);
    }
}
