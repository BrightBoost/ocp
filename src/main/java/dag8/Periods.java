package dag8;

import java.time.LocalDate;
import java.time.Period;

public class Periods {
    public static void main(String[] args) {
        Period p = Period.parse("P1Y9M76D");
        LocalDate ld = LocalDate.now();
        System.out.println(ld.plus(p));

        System.out.println(p.plus(p));
    }
}
