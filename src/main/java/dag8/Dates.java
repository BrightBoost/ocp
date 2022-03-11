package dag8;

import java.time.*;

public class Dates {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDate ld2 = LocalDate.of(2022, 6, 30);
        System.out.println(ld2);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalTime lt2 = LocalTime.of(9, 58, 0,10);
        System.out.println(lt2);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDateTime ldt2 = LocalDateTime.of(2022, 3, 11, 10, 5, 12);
        System.out.println(ldt2);

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("Africa/Cairo"));
        System.out.println(zdt1);

//        for(String zid : ZoneId.getAvailableZoneIds()) {
//            System.out.println(zid);
//        }

        ZonedDateTime zdt2 = ZonedDateTime.of(ldt, ZoneId.of("Africa/Cairo"));
        System.out.println(zdt2);



    }
}
