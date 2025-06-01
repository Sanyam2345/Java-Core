package JavaDateTime;

import java.time.ZoneId;

public class ZoneIdDemo {
    public static void main(String[] args) {
        ZoneId zid = ZoneId.of("Asia/Kolkata");
        System.out.println(zid);
        System.out.println(zid.getRules());
        System.out.println(zid.normalized());
    }
}
