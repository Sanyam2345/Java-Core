package JavaDateTime;

import java.time.LocalTime;

public class LocalTimeAPIDemo {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalTime lt1 = LocalTime.of(10, 30);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.parse("10:30:00");
        System.out.println(lt2);
        LocalTime lt3 = LocalTime.ofSecondOfDay(10000);
        System.out.println(lt3);
        LocalTime lt4 = LocalTime.ofNanoOfDay(1000000000);
        System.out.println(lt4);
        LocalTime lt5 = lt.plusHours(1);
        System.out.println(lt5);
        LocalTime lt6 = lt.minusHours(1);
        System.out.println(lt6);
        LocalTime lt7 = lt.plusNanos(1000000000);
        System.out.println(lt7);
        LocalTime lt8 = lt.minusNanos(1000000000);
        System.out.println(lt8);
        LocalTime lt9 = lt.plusSeconds(10);
        System.out.println(lt9);
        LocalTime lt10 = lt.minusSeconds(10);
        System.out.println(lt10);
        LocalTime lt11 = lt.plusMinutes(10);
        System.out.println(lt11);
        LocalTime lt12 = lt.minusMinutes(10);
        System.out.println(lt12);
        LocalTime lt13 = lt.withHour(10);
        System.out.println(lt13);
        LocalTime lt14 = lt.withMinute(10);
        System.out.println(lt14);
        LocalTime lt15 = lt.withSecond(10);
        System.out.println(lt15);
        LocalTime lt16 = lt.withNano(10);
        System.out.println(lt16);

    }
}
