package JavaDateTime;

import java.time.Year;

public class YearDemo {
    public static void main(String[] args) {
        Year y = Year.now();
        System.out.println(y);
        System.out.println(y.isLeap());
        System.out.println(y.getValue());
    }
}
