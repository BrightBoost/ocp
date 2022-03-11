package dag8;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Durations {
    public static void main(String[] args) {
        Duration d = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(d);

        Duration d2 = Duration.of(10, ChronoUnit.MINUTES);
        System.out.println(d2);

        System.out.println(d.plus(d2));

        ZonedDateTime zdt = ZonedDateTime.of(2022, 3, 27, 1, 0, 0, 0, ZoneId.systemDefault());
        System.out.println(zdt);
        System.out.println(zdt.plus(d));
        System.out.println(zdt.plus(Period.ofDays(1))); // plus period of 1 day and duration of 1 day different result

        Instant i = Instant.now();
        System.out.println(i);
//        ZonedDateTime zdt1 = ZonedDateTime.ofInstant(i, ZoneId.of("blabla"));

    }
}
