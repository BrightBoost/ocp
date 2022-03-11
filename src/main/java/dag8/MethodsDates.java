package dag8;

import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class MethodsDates {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, 1, 28);
        ld.plusDays(1);
        System.out.println(ld.minus(9, ChronoUnit.MILLENNIA));

        LocalTime lt = LocalTime.now();
        System.out.println(lt.plusHours(48));
    }
}
